
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity213;

public abstract class Repository213 extends AbstractEntityRepository<Entity213, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity213 findByName(String name);
}
