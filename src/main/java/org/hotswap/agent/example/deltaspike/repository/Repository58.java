
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity58;

public abstract class Repository58 extends AbstractEntityRepository<Entity58, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity58 findByName(String name);
}
