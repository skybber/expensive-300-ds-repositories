
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity266;

public abstract class Repository266 extends AbstractEntityRepository<Entity266, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity266 findByName(String name);
}
