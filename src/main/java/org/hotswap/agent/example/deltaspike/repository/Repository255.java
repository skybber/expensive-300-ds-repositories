
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity255;

public abstract class Repository255 extends AbstractEntityRepository<Entity255, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity255 findByName(String name);
}
