
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity248;

public abstract class Repository248 extends AbstractEntityRepository<Entity248, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity248 findByName(String name);
}
