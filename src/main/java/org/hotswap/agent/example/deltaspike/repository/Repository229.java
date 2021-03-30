
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity229;

public abstract class Repository229 extends AbstractEntityRepository<Entity229, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity229 findByName(String name);
}
