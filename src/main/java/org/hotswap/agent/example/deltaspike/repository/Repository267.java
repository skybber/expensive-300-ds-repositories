
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity267;

public abstract class Repository267 extends AbstractEntityRepository<Entity267, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity267 findByName(String name);
}
