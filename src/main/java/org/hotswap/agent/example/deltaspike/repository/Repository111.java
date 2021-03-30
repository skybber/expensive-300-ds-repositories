
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity111;

public abstract class Repository111 extends AbstractEntityRepository<Entity111, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity111 findByName(String name);
}
