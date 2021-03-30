
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity74;

public abstract class Repository74 extends AbstractEntityRepository<Entity74, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity74 findByName(String name);
}
