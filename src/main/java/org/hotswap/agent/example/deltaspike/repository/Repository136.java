
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity136;

public abstract class Repository136 extends AbstractEntityRepository<Entity136, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity136 findByName(String name);
}
