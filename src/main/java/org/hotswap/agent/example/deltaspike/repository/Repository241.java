
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity241;

public abstract class Repository241 extends AbstractEntityRepository<Entity241, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity241 findByName(String name);
}
