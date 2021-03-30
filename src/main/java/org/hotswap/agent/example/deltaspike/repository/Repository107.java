
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity107;

public abstract class Repository107 extends AbstractEntityRepository<Entity107, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity107 findByName(String name);
}
