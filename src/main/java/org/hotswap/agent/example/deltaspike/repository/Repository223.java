
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity223;

public abstract class Repository223 extends AbstractEntityRepository<Entity223, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity223 findByName(String name);
}
