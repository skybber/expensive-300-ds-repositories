
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity90;

public abstract class Repository90 extends AbstractEntityRepository<Entity90, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity90 findByName(String name);
}
