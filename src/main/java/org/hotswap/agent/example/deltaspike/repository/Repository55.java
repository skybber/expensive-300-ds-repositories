
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity55;

public abstract class Repository55 extends AbstractEntityRepository<Entity55, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity55 findByName(String name);
}
