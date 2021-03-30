
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity234;

public abstract class Repository234 extends AbstractEntityRepository<Entity234, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity234 findByName(String name);
}
