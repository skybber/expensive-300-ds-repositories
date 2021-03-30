
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity5;

public abstract class Repository5 extends AbstractEntityRepository<Entity5, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity5 findByName(String name);
}
