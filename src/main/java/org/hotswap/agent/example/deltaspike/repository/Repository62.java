
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity62;

public abstract class Repository62 extends AbstractEntityRepository<Entity62, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity62 findByName(String name);
}
