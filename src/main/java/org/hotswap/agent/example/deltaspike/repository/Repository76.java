
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity76;

public abstract class Repository76 extends AbstractEntityRepository<Entity76, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity76 findByName(String name);
}
