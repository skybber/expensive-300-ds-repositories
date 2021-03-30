
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity130;

public abstract class Repository130 extends AbstractEntityRepository<Entity130, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity130 findByName(String name);
}
