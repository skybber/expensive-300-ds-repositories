
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity29;

public abstract class Repository29 extends AbstractEntityRepository<Entity29, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity29 findByName(String name);
}
