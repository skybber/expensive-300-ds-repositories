
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity42;

public abstract class Repository42 extends AbstractEntityRepository<Entity42, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity42 findByName(String name);
}
