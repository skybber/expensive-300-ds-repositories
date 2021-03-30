
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity220;

public abstract class Repository220 extends AbstractEntityRepository<Entity220, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity220 findByName(String name);
}
