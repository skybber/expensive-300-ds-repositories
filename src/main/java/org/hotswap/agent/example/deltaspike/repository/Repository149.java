
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity149;

public abstract class Repository149 extends AbstractEntityRepository<Entity149, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity149 findByName(String name);
}
