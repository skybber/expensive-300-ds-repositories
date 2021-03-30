
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity113;

public abstract class Repository113 extends AbstractEntityRepository<Entity113, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity113 findByName(String name);
}
