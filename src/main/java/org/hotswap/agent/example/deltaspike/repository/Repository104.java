
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity104;

public abstract class Repository104 extends AbstractEntityRepository<Entity104, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity104 findByName(String name);
}
