
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity264;

public abstract class Repository264 extends AbstractEntityRepository<Entity264, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity264 findByName(String name);
}
