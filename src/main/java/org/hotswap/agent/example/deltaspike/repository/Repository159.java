
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity159;

public abstract class Repository159 extends AbstractEntityRepository<Entity159, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity159 findByName(String name);
}
