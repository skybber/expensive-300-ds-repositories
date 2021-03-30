
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity226;

public abstract class Repository226 extends AbstractEntityRepository<Entity226, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity226 findByName(String name);
}
