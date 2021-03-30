
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity216;

public abstract class Repository216 extends AbstractEntityRepository<Entity216, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity216 findByName(String name);
}
