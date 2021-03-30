
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity163;

public abstract class Repository163 extends AbstractEntityRepository<Entity163, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity163 findByName(String name);
}
