
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity262;

public abstract class Repository262 extends AbstractEntityRepository<Entity262, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity262 findByName(String name);
}
