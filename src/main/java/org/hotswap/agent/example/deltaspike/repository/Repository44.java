
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity44;

public abstract class Repository44 extends AbstractEntityRepository<Entity44, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity44 findByName(String name);
}
