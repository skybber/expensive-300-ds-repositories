
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity247;

public abstract class Repository247 extends AbstractEntityRepository<Entity247, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity247 findByName(String name);
}
