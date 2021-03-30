
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity83;

public abstract class Repository83 extends AbstractEntityRepository<Entity83, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity83 findByName(String name);
}
