
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity135;

public abstract class Repository135 extends AbstractEntityRepository<Entity135, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity135 findByName(String name);
}
