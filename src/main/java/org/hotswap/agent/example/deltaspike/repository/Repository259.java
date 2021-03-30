
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity259;

public abstract class Repository259 extends AbstractEntityRepository<Entity259, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity259 findByName(String name);
}
