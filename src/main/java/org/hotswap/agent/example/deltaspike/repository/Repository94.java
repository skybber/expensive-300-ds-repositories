
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity94;

public abstract class Repository94 extends AbstractEntityRepository<Entity94, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity94 findByName(String name);
}
