
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity72;

public abstract class Repository72 extends AbstractEntityRepository<Entity72, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity72 findByName(String name);
}
