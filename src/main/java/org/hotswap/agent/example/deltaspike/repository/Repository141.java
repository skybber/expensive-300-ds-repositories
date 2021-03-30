
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity141;

public abstract class Repository141 extends AbstractEntityRepository<Entity141, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity141 findByName(String name);
}
