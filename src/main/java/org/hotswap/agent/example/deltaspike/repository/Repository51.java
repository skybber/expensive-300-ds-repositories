
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity51;

public abstract class Repository51 extends AbstractEntityRepository<Entity51, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity51 findByName(String name);
}
