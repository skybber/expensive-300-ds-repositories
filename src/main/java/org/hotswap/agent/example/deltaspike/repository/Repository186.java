
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity186;

public abstract class Repository186 extends AbstractEntityRepository<Entity186, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity186 findByName(String name);
}
