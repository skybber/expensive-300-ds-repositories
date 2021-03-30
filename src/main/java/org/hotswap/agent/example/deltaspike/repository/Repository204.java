
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity204;

public abstract class Repository204 extends AbstractEntityRepository<Entity204, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity204 findByName(String name);
}
