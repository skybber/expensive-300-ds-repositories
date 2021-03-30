
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity142;

public abstract class Repository142 extends AbstractEntityRepository<Entity142, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity142 findByName(String name);
}
