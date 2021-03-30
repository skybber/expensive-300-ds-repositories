
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity101;

public abstract class Repository101 extends AbstractEntityRepository<Entity101, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity101 findByName(String name);
}
