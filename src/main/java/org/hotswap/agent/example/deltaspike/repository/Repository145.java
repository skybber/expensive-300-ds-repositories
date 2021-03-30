
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity145;

public abstract class Repository145 extends AbstractEntityRepository<Entity145, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity145 findByName(String name);
}
