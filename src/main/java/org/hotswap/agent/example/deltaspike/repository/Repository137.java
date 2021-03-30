
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity137;

public abstract class Repository137 extends AbstractEntityRepository<Entity137, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity137 findByName(String name);
}
