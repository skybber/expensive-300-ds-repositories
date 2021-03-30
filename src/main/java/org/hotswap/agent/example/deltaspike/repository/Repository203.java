
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity203;

public abstract class Repository203 extends AbstractEntityRepository<Entity203, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity203 findByName(String name);
}
