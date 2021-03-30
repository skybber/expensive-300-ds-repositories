
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity199;

public abstract class Repository199 extends AbstractEntityRepository<Entity199, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity199 findByName(String name);
}
