
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity88;

public abstract class Repository88 extends AbstractEntityRepository<Entity88, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity88 findByName(String name);
}
