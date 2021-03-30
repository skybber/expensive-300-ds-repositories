
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity89;

public abstract class Repository89 extends AbstractEntityRepository<Entity89, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity89 findByName(String name);
}
