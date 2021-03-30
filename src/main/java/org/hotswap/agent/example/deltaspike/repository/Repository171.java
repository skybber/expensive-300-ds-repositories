
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity171;

public abstract class Repository171 extends AbstractEntityRepository<Entity171, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity171 findByName(String name);
}
