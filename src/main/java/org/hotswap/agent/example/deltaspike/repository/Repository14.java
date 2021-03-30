
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity14;

public abstract class Repository14 extends AbstractEntityRepository<Entity14, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity14 findByName(String name);
}
