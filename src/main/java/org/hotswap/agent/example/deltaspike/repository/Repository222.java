
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity222;

public abstract class Repository222 extends AbstractEntityRepository<Entity222, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity222 findByName(String name);
}
