
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity80;

public abstract class Repository80 extends AbstractEntityRepository<Entity80, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity80 findByName(String name);
}
