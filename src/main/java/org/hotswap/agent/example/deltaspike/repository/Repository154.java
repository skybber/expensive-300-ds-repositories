
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity154;

public abstract class Repository154 extends AbstractEntityRepository<Entity154, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity154 findByName(String name);
}
