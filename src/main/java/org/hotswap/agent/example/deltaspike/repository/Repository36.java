
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity36;

public abstract class Repository36 extends AbstractEntityRepository<Entity36, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity36 findByName(String name);
}
