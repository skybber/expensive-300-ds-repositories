
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity296;

public abstract class Repository296 extends AbstractEntityRepository<Entity296, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity296 findByName(String name);
}
