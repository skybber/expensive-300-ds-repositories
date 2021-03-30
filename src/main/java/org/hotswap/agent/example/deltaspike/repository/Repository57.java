
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity57;

public abstract class Repository57 extends AbstractEntityRepository<Entity57, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity57 findByName(String name);
}
