
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity265;

public abstract class Repository265 extends AbstractEntityRepository<Entity265, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity265 findByName(String name);
}
