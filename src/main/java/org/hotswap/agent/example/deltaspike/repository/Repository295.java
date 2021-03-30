
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity295;

public abstract class Repository295 extends AbstractEntityRepository<Entity295, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity295 findByName(String name);
}
