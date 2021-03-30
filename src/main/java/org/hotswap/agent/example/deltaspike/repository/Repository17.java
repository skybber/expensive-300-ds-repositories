
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity17;

public abstract class Repository17 extends AbstractEntityRepository<Entity17, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity17 findByName(String name);
}
