
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity33;

public abstract class Repository33 extends AbstractEntityRepository<Entity33, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity33 findByName(String name);
}
