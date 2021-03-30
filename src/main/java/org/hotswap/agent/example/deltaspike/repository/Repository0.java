
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity0;

public abstract class Repository0 extends AbstractEntityRepository<Entity0, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity0 findByName(String name);
}
