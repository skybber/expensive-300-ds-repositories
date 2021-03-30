
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity132;

public abstract class Repository132 extends AbstractEntityRepository<Entity132, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity132 findByName(String name);
}
