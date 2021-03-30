
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity167;

public abstract class Repository167 extends AbstractEntityRepository<Entity167, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity167 findByName(String name);
}
