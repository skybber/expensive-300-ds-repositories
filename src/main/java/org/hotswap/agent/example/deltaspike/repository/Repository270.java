
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity270;

public abstract class Repository270 extends AbstractEntityRepository<Entity270, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity270 findByName(String name);
}
