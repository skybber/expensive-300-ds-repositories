
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity9;

public abstract class Repository9 extends AbstractEntityRepository<Entity9, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity9 findByName(String name);
}
