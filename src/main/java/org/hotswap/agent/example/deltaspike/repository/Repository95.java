
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity95;

public abstract class Repository95 extends AbstractEntityRepository<Entity95, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity95 findByName(String name);
}
