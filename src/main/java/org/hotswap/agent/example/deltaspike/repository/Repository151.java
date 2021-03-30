
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity151;

public abstract class Repository151 extends AbstractEntityRepository<Entity151, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity151 findByName(String name);
}
