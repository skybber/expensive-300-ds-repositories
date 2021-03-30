
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity205;

public abstract class Repository205 extends AbstractEntityRepository<Entity205, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity205 findByName(String name);
}
