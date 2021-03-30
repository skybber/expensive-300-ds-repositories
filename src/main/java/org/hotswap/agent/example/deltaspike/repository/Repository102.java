
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity102;

public abstract class Repository102 extends AbstractEntityRepository<Entity102, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity102 findByName(String name);
}
