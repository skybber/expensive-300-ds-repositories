
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity127;

public abstract class Repository127 extends AbstractEntityRepository<Entity127, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity127 findByName(String name);
}
