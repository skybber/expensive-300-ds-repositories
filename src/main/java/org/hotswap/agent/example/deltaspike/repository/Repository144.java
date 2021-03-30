
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity144;

public abstract class Repository144 extends AbstractEntityRepository<Entity144, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity144 findByName(String name);
}
