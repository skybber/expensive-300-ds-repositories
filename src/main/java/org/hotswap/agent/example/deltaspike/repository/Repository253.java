
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity253;

public abstract class Repository253 extends AbstractEntityRepository<Entity253, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity253 findByName(String name);
}
