
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity60;

public abstract class Repository60 extends AbstractEntityRepository<Entity60, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity60 findByName(String name);
}
