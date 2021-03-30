
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity40;

public abstract class Repository40 extends AbstractEntityRepository<Entity40, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity40 findByName(String name);
}
