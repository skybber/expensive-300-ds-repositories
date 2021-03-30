
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity100;

public abstract class Repository100 extends AbstractEntityRepository<Entity100, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity100 findByName(String name);
}
