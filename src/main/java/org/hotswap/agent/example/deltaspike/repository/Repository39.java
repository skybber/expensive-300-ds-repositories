
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity39;

public abstract class Repository39 extends AbstractEntityRepository<Entity39, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity39 findByName(String name);
}
