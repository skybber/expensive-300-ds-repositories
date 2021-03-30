
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity263;

public abstract class Repository263 extends AbstractEntityRepository<Entity263, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity263 findByName(String name);
}
