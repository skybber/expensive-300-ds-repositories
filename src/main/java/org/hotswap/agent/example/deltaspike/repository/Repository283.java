
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity283;

public abstract class Repository283 extends AbstractEntityRepository<Entity283, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity283 findByName(String name);
}
