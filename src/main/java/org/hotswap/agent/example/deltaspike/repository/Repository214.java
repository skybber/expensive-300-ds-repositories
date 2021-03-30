
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity214;

public abstract class Repository214 extends AbstractEntityRepository<Entity214, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity214 findByName(String name);
}
