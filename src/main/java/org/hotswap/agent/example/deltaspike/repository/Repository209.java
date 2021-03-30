
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity209;

public abstract class Repository209 extends AbstractEntityRepository<Entity209, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity209 findByName(String name);
}
