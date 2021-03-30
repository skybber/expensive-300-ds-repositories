
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity28;

public abstract class Repository28 extends AbstractEntityRepository<Entity28, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity28 findByName(String name);
}
