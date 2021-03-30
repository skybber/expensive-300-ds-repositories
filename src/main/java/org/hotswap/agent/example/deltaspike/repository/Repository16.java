
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity16;

public abstract class Repository16 extends AbstractEntityRepository<Entity16, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity16 findByName(String name);
}
