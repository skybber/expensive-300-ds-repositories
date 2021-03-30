
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity150;

public abstract class Repository150 extends AbstractEntityRepository<Entity150, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity150 findByName(String name);
}
