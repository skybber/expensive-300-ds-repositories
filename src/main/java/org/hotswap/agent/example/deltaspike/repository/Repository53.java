
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity53;

public abstract class Repository53 extends AbstractEntityRepository<Entity53, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity53 findByName(String name);
}
