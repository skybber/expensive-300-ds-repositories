
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity115;

public abstract class Repository115 extends AbstractEntityRepository<Entity115, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity115 findByName(String name);
}
