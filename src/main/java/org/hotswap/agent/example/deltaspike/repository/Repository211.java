
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity211;

public abstract class Repository211 extends AbstractEntityRepository<Entity211, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity211 findByName(String name);
}
