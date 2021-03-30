
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity139;

public abstract class Repository139 extends AbstractEntityRepository<Entity139, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity139 findByName(String name);
}
