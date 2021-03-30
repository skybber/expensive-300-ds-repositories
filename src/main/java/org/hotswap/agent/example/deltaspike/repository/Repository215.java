
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity215;

public abstract class Repository215 extends AbstractEntityRepository<Entity215, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity215 findByName(String name);
}
