
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity273;

public abstract class Repository273 extends AbstractEntityRepository<Entity273, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity273 findByName(String name);
}
