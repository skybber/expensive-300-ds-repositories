
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity108;

public abstract class Repository108 extends AbstractEntityRepository<Entity108, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity108 findByName(String name);
}
