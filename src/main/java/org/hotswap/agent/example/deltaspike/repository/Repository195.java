
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity195;

public abstract class Repository195 extends AbstractEntityRepository<Entity195, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity195 findByName(String name);
}
