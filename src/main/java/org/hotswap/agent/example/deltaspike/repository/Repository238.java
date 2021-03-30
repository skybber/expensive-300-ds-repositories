
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity238;

public abstract class Repository238 extends AbstractEntityRepository<Entity238, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity238 findByName(String name);
}
