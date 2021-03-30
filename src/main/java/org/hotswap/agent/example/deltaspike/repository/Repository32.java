
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity32;

public abstract class Repository32 extends AbstractEntityRepository<Entity32, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity32 findByName(String name);
}
