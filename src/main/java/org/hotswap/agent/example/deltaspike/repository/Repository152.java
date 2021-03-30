
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity152;

public abstract class Repository152 extends AbstractEntityRepository<Entity152, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity152 findByName(String name);
}
