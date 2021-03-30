
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity208;

public abstract class Repository208 extends AbstractEntityRepository<Entity208, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity208 findByName(String name);
}
