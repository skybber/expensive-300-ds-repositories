
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity228;

public abstract class Repository228 extends AbstractEntityRepository<Entity228, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity228 findByName(String name);
}
