
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity146;

public abstract class Repository146 extends AbstractEntityRepository<Entity146, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity146 findByName(String name);
}
