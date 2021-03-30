
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity231;

public abstract class Repository231 extends AbstractEntityRepository<Entity231, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity231 findByName(String name);
}
