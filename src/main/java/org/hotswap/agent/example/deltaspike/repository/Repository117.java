
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity117;

public abstract class Repository117 extends AbstractEntityRepository<Entity117, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity117 findByName(String name);
}
