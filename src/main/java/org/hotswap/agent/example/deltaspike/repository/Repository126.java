
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity126;

public abstract class Repository126 extends AbstractEntityRepository<Entity126, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity126 findByName(String name);
}
