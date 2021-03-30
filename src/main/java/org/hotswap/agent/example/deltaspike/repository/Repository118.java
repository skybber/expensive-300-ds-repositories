
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity118;

public abstract class Repository118 extends AbstractEntityRepository<Entity118, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity118 findByName(String name);
}
