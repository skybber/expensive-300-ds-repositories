
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity70;

public abstract class Repository70 extends AbstractEntityRepository<Entity70, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity70 findByName(String name);
}
