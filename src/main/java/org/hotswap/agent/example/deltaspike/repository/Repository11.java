
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity11;

public abstract class Repository11 extends AbstractEntityRepository<Entity11, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity11 findByName(String name);
}
