
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity43;

public abstract class Repository43 extends AbstractEntityRepository<Entity43, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity43 findByName(String name);
}
