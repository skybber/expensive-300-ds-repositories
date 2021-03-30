
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity168;

public abstract class Repository168 extends AbstractEntityRepository<Entity168, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity168 findByName(String name);
}
