
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity246;

public abstract class Repository246 extends AbstractEntityRepository<Entity246, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity246 findByName(String name);
}
