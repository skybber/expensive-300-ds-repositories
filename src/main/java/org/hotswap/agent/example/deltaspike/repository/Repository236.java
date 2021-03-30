
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity236;

public abstract class Repository236 extends AbstractEntityRepository<Entity236, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity236 findByName(String name);
}
