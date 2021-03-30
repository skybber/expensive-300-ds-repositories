
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity272;

public abstract class Repository272 extends AbstractEntityRepository<Entity272, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity272 findByName(String name);
}
