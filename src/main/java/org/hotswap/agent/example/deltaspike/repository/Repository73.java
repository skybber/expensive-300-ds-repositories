
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity73;

public abstract class Repository73 extends AbstractEntityRepository<Entity73, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity73 findByName(String name);
}
