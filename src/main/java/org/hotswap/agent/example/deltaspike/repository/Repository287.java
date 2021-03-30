
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity287;

public abstract class Repository287 extends AbstractEntityRepository<Entity287, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity287 findByName(String name);
}
