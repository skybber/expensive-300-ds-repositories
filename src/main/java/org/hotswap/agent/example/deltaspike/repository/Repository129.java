
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity129;

public abstract class Repository129 extends AbstractEntityRepository<Entity129, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity129 findByName(String name);
}
