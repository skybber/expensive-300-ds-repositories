
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity110;

public abstract class Repository110 extends AbstractEntityRepository<Entity110, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity110 findByName(String name);
}
