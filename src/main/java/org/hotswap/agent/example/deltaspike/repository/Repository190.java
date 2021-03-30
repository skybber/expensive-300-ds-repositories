
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity190;

public abstract class Repository190 extends AbstractEntityRepository<Entity190, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity190 findByName(String name);
}
