
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity277;

public abstract class Repository277 extends AbstractEntityRepository<Entity277, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity277 findByName(String name);
}
