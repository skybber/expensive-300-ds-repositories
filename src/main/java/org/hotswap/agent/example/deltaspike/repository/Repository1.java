
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity1;

public abstract class Repository1 extends AbstractEntityRepository<Entity1, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity1 findByName(String name);
}
