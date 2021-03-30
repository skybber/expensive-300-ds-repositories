
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity82;

public abstract class Repository82 extends AbstractEntityRepository<Entity82, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity82 findByName(String name);
}
