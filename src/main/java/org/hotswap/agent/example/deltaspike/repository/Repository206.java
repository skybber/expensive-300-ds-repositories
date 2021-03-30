
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity206;

public abstract class Repository206 extends AbstractEntityRepository<Entity206, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity206 findByName(String name);
}
