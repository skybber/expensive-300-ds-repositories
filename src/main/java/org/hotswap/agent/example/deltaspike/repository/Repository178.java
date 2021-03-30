
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity178;

public abstract class Repository178 extends AbstractEntityRepository<Entity178, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity178 findByName(String name);
}
