
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity225;

public abstract class Repository225 extends AbstractEntityRepository<Entity225, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity225 findByName(String name);
}
