
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity224;

public abstract class Repository224 extends AbstractEntityRepository<Entity224, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity224 findByName(String name);
}
