
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity261;

public abstract class Repository261 extends AbstractEntityRepository<Entity261, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity261 findByName(String name);
}
