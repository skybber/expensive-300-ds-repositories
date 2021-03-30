
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity119;

public abstract class Repository119 extends AbstractEntityRepository<Entity119, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity119 findByName(String name);
}
