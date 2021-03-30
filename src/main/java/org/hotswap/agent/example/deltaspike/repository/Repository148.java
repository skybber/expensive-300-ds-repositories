
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity148;

public abstract class Repository148 extends AbstractEntityRepository<Entity148, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity148 findByName(String name);
}
