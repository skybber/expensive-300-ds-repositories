
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity123;

public abstract class Repository123 extends AbstractEntityRepository<Entity123, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity123 findByName(String name);
}
