
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity2;

public abstract class Repository2 extends AbstractEntityRepository<Entity2, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity2 findByName(String name);
}
