
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity68;

public abstract class Repository68 extends AbstractEntityRepository<Entity68, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity68 findByName(String name);
}
