
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity183;

public abstract class Repository183 extends AbstractEntityRepository<Entity183, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity183 findByName(String name);
}
