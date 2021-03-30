
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity86;

public abstract class Repository86 extends AbstractEntityRepository<Entity86, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity86 findByName(String name);
}
