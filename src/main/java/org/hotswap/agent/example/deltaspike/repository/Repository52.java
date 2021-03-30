
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity52;

public abstract class Repository52 extends AbstractEntityRepository<Entity52, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity52 findByName(String name);
}
