
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity79;

public abstract class Repository79 extends AbstractEntityRepository<Entity79, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity79 findByName(String name);
}
