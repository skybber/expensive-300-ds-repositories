
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity24;

public abstract class Repository24 extends AbstractEntityRepository<Entity24, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity24 findByName(String name);
}
