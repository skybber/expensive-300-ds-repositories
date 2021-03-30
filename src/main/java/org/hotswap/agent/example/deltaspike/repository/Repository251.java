
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity251;

public abstract class Repository251 extends AbstractEntityRepository<Entity251, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity251 findByName(String name);
}
