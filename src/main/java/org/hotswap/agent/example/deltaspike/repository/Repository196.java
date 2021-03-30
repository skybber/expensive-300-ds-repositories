
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity196;

public abstract class Repository196 extends AbstractEntityRepository<Entity196, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity196 findByName(String name);
}
