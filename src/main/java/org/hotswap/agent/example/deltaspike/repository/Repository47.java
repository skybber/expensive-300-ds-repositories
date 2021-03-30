
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity47;

public abstract class Repository47 extends AbstractEntityRepository<Entity47, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity47 findByName(String name);
}
