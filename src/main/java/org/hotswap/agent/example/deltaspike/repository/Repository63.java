
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity63;

public abstract class Repository63 extends AbstractEntityRepository<Entity63, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity63 findByName(String name);
}
