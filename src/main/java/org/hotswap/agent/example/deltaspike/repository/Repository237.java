
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity237;

public abstract class Repository237 extends AbstractEntityRepository<Entity237, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity237 findByName(String name);
}
