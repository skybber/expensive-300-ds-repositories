
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity158;

public abstract class Repository158 extends AbstractEntityRepository<Entity158, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity158 findByName(String name);
}
