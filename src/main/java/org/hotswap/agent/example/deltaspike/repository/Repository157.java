
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity157;

public abstract class Repository157 extends AbstractEntityRepository<Entity157, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity157 findByName(String name);
}
