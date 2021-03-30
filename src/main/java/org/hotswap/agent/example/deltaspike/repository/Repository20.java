
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity20;

public abstract class Repository20 extends AbstractEntityRepository<Entity20, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity20 findByName(String name);
}
