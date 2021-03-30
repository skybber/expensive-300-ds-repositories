
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity172;

public abstract class Repository172 extends AbstractEntityRepository<Entity172, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity172 findByName(String name);
}
