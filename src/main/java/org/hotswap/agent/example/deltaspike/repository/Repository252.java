
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity252;

public abstract class Repository252 extends AbstractEntityRepository<Entity252, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity252 findByName(String name);
}
