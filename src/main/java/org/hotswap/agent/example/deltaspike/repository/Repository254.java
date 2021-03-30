
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity254;

public abstract class Repository254 extends AbstractEntityRepository<Entity254, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity254 findByName(String name);
}
