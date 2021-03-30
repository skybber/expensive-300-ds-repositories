
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity173;

public abstract class Repository173 extends AbstractEntityRepository<Entity173, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity173 findByName(String name);
}
