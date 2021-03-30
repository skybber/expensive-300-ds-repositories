
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity293;

public abstract class Repository293 extends AbstractEntityRepository<Entity293, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity293 findByName(String name);
}
