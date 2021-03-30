
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity233;

public abstract class Repository233 extends AbstractEntityRepository<Entity233, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity233 findByName(String name);
}
