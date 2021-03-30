
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity124;

public abstract class Repository124 extends AbstractEntityRepository<Entity124, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity124 findByName(String name);
}
