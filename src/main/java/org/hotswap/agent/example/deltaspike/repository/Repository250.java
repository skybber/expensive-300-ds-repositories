
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity250;

public abstract class Repository250 extends AbstractEntityRepository<Entity250, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity250 findByName(String name);
}
