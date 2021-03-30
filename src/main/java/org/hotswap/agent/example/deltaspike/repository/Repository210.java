
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity210;

public abstract class Repository210 extends AbstractEntityRepository<Entity210, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity210 findByName(String name);
}
