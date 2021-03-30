
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity280;

public abstract class Repository280 extends AbstractEntityRepository<Entity280, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity280 findByName(String name);
}
