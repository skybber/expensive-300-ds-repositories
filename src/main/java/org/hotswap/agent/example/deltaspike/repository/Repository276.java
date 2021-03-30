
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity276;

public abstract class Repository276 extends AbstractEntityRepository<Entity276, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity276 findByName(String name);
}
