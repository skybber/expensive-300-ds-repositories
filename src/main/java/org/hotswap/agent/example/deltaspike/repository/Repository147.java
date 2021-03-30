
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity147;

public abstract class Repository147 extends AbstractEntityRepository<Entity147, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity147 findByName(String name);
}
