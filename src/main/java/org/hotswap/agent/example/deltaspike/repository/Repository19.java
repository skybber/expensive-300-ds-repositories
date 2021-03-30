
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity19;

public abstract class Repository19 extends AbstractEntityRepository<Entity19, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity19 findByName(String name);
}
