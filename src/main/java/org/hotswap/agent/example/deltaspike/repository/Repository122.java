
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity122;

public abstract class Repository122 extends AbstractEntityRepository<Entity122, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity122 findByName(String name);
}
