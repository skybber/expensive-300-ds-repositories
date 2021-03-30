
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity31;

public abstract class Repository31 extends AbstractEntityRepository<Entity31, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity31 findByName(String name);
}
