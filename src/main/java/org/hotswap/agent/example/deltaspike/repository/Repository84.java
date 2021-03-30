
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity84;

public abstract class Repository84 extends AbstractEntityRepository<Entity84, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity84 findByName(String name);
}
