
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity21;

public abstract class Repository21 extends AbstractEntityRepository<Entity21, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity21 findByName(String name);
}
