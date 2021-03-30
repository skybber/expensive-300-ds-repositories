
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity41;

public abstract class Repository41 extends AbstractEntityRepository<Entity41, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity41 findByName(String name);
}
