
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity258;

public abstract class Repository258 extends AbstractEntityRepository<Entity258, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity258 findByName(String name);
}
