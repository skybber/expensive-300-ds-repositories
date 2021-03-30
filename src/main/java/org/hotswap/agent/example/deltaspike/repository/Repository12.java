
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity12;

public abstract class Repository12 extends AbstractEntityRepository<Entity12, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity12 findByName(String name);
}
