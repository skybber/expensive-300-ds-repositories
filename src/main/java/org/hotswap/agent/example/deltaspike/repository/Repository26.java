
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity26;

public abstract class Repository26 extends AbstractEntityRepository<Entity26, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity26 findByName(String name);
}
