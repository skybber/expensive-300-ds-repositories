
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity48;

public abstract class Repository48 extends AbstractEntityRepository<Entity48, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity48 findByName(String name);
}
