
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity96;

public abstract class Repository96 extends AbstractEntityRepository<Entity96, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity96 findByName(String name);
}
