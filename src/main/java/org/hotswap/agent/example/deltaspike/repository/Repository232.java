
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity232;

public abstract class Repository232 extends AbstractEntityRepository<Entity232, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity232 findByName(String name);
}
