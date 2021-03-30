
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity38;

public abstract class Repository38 extends AbstractEntityRepository<Entity38, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity38 findByName(String name);
}
