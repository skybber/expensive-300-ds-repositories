
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity85;

public abstract class Repository85 extends AbstractEntityRepository<Entity85, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity85 findByName(String name);
}
