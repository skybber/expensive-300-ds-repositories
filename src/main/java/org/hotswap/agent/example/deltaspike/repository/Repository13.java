
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity13;

public abstract class Repository13 extends AbstractEntityRepository<Entity13, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity13 findByName(String name);
}
