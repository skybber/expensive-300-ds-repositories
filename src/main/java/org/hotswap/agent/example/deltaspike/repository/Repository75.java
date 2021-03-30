
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity75;

public abstract class Repository75 extends AbstractEntityRepository<Entity75, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity75 findByName(String name);
}
