
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity281;

public abstract class Repository281 extends AbstractEntityRepository<Entity281, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity281 findByName(String name);
}
