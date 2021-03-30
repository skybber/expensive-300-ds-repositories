
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity18;

public abstract class Repository18 extends AbstractEntityRepository<Entity18, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity18 findByName(String name);
}
