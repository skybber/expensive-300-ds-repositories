
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity153;

public abstract class Repository153 extends AbstractEntityRepository<Entity153, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity153 findByName(String name);
}
