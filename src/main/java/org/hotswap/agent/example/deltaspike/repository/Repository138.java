
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity138;

public abstract class Repository138 extends AbstractEntityRepository<Entity138, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity138 findByName(String name);
}
