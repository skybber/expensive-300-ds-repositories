
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity166;

public abstract class Repository166 extends AbstractEntityRepository<Entity166, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity166 findByName(String name);
}
