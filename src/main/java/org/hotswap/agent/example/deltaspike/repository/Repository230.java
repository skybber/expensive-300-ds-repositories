
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity230;

public abstract class Repository230 extends AbstractEntityRepository<Entity230, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity230 findByName(String name);
}
