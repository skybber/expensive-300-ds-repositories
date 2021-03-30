
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity245;

public abstract class Repository245 extends AbstractEntityRepository<Entity245, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity245 findByName(String name);
}
