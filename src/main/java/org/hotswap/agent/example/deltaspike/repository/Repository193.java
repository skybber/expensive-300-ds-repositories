
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity193;

public abstract class Repository193 extends AbstractEntityRepository<Entity193, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity193 findByName(String name);
}
