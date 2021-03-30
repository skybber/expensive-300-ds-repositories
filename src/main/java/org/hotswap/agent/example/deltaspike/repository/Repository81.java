
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity81;

public abstract class Repository81 extends AbstractEntityRepository<Entity81, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity81 findByName(String name);
}
