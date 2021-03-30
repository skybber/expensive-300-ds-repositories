
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity286;

public abstract class Repository286 extends AbstractEntityRepository<Entity286, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity286 findByName(String name);
}
