
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity269;

public abstract class Repository269 extends AbstractEntityRepository<Entity269, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity269 findByName(String name);
}
