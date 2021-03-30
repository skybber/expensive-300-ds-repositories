
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity54;

public abstract class Repository54 extends AbstractEntityRepository<Entity54, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity54 findByName(String name);
}
