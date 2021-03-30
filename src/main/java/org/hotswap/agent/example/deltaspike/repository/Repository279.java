
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity279;

public abstract class Repository279 extends AbstractEntityRepository<Entity279, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity279 findByName(String name);
}
