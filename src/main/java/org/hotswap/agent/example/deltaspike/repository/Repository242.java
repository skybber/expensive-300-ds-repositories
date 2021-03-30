
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity242;

public abstract class Repository242 extends AbstractEntityRepository<Entity242, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity242 findByName(String name);
}
