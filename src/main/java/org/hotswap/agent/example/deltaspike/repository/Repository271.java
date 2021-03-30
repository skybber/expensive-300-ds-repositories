
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity271;

public abstract class Repository271 extends AbstractEntityRepository<Entity271, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity271 findByName(String name);
}
