
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity6;

public abstract class Repository6 extends AbstractEntityRepository<Entity6, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity6 findByName(String name);
}
