
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity30;

public abstract class Repository30 extends AbstractEntityRepository<Entity30, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity30 findByName(String name);
}
