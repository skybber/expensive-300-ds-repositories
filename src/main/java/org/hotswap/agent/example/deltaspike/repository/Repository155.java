
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity155;

public abstract class Repository155 extends AbstractEntityRepository<Entity155, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity155 findByName(String name);
}
