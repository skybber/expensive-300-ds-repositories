
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity114;

public abstract class Repository114 extends AbstractEntityRepository<Entity114, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity114 findByName(String name);
}
