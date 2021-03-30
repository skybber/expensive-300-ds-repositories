
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity161;

public abstract class Repository161 extends AbstractEntityRepository<Entity161, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity161 findByName(String name);
}
