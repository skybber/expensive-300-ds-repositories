
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity156;

public abstract class Repository156 extends AbstractEntityRepository<Entity156, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity156 findByName(String name);
}
