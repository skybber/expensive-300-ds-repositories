
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity290;

public abstract class Repository290 extends AbstractEntityRepository<Entity290, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity290 findByName(String name);
}
