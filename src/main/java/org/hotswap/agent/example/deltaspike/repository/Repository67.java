
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity67;

public abstract class Repository67 extends AbstractEntityRepository<Entity67, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity67 findByName(String name);
}
