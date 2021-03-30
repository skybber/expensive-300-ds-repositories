
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity174;

public abstract class Repository174 extends AbstractEntityRepository<Entity174, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity174 findByName(String name);
}
