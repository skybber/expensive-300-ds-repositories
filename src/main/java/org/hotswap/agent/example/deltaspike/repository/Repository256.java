
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity256;

public abstract class Repository256 extends AbstractEntityRepository<Entity256, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity256 findByName(String name);
}
