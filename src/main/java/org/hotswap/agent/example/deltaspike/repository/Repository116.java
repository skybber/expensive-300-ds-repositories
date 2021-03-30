
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity116;

public abstract class Repository116 extends AbstractEntityRepository<Entity116, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity116 findByName(String name);
}
