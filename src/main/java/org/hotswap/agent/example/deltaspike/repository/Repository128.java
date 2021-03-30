
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity128;

public abstract class Repository128 extends AbstractEntityRepository<Entity128, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity128 findByName(String name);
}
