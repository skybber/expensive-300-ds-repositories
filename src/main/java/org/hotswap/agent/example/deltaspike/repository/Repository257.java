
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity257;

public abstract class Repository257 extends AbstractEntityRepository<Entity257, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity257 findByName(String name);
}
