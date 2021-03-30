
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity170;

public abstract class Repository170 extends AbstractEntityRepository<Entity170, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity170 findByName(String name);
}
