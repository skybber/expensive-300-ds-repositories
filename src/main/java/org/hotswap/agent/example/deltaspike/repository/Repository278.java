
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity278;

public abstract class Repository278 extends AbstractEntityRepository<Entity278, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity278 findByName(String name);
}
