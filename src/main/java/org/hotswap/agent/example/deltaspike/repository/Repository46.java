
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity46;

public abstract class Repository46 extends AbstractEntityRepository<Entity46, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity46 findByName(String name);
}
