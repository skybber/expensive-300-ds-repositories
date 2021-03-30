
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity71;

public abstract class Repository71 extends AbstractEntityRepository<Entity71, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity71 findByName(String name);
}
