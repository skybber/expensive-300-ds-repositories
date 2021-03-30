
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity66;

public abstract class Repository66 extends AbstractEntityRepository<Entity66, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity66 findByName(String name);
}
