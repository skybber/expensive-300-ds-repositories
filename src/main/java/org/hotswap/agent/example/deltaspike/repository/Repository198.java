
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity198;

public abstract class Repository198 extends AbstractEntityRepository<Entity198, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity198 findByName(String name);
}
