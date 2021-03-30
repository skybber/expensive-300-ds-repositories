
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity23;

public abstract class Repository23 extends AbstractEntityRepository<Entity23, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity23 findByName(String name);
}
