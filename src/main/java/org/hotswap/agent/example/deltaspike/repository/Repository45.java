
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity45;

public abstract class Repository45 extends AbstractEntityRepository<Entity45, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity45 findByName(String name);
}
