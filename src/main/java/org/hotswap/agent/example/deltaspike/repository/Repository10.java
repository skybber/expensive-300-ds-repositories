
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity10;

public abstract class Repository10 extends AbstractEntityRepository<Entity10, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity10 findByName(String name);
}
