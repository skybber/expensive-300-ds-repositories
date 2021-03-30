
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity243;

public abstract class Repository243 extends AbstractEntityRepository<Entity243, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity243 findByName(String name);
}
