
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity275;

public abstract class Repository275 extends AbstractEntityRepository<Entity275, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity275 findByName(String name);
}
