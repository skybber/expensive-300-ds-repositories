
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity27;

public abstract class Repository27 extends AbstractEntityRepository<Entity27, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity27 findByName(String name);
}
