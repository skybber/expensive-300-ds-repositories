
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity61;

public abstract class Repository61 extends AbstractEntityRepository<Entity61, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity61 findByName(String name);
}
