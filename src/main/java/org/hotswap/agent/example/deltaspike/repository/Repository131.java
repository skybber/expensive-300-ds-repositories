
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity131;

public abstract class Repository131 extends AbstractEntityRepository<Entity131, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity131 findByName(String name);
}
