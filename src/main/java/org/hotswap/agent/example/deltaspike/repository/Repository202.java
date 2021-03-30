
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity202;

public abstract class Repository202 extends AbstractEntityRepository<Entity202, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity202 findByName(String name);
}
