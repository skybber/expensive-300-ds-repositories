
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity201;

public abstract class Repository201 extends AbstractEntityRepository<Entity201, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity201 findByName(String name);
}
