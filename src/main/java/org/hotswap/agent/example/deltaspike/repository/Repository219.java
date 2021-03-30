
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity219;

public abstract class Repository219 extends AbstractEntityRepository<Entity219, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity219 findByName(String name);
}
