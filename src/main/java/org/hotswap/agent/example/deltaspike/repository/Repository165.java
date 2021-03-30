
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity165;

public abstract class Repository165 extends AbstractEntityRepository<Entity165, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity165 findByName(String name);
}
