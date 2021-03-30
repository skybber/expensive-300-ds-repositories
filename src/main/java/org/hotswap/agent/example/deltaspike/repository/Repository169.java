
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity169;

public abstract class Repository169 extends AbstractEntityRepository<Entity169, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity169 findByName(String name);
}
