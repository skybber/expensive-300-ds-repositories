
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity4;

public abstract class Repository4 extends AbstractEntityRepository<Entity4, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity4 findByName(String name);
}
