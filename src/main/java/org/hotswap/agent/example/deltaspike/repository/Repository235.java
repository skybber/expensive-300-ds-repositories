
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity235;

public abstract class Repository235 extends AbstractEntityRepository<Entity235, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity235 findByName(String name);
}
