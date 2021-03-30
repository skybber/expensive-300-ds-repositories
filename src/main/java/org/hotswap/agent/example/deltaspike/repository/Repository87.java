
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity87;

public abstract class Repository87 extends AbstractEntityRepository<Entity87, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity87 findByName(String name);
}
