
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity194;

public abstract class Repository194 extends AbstractEntityRepository<Entity194, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity194 findByName(String name);
}
