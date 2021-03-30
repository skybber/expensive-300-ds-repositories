
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity59;

public abstract class Repository59 extends AbstractEntityRepository<Entity59, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity59 findByName(String name);
}
