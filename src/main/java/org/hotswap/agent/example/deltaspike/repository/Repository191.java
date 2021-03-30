
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity191;

public abstract class Repository191 extends AbstractEntityRepository<Entity191, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity191 findByName(String name);
}
