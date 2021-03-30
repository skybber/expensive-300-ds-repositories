
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity180;

public abstract class Repository180 extends AbstractEntityRepository<Entity180, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity180 findByName(String name);
}
