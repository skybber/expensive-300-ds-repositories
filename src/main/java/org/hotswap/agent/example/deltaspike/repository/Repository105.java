
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity105;

public abstract class Repository105 extends AbstractEntityRepository<Entity105, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity105 findByName(String name);
}
