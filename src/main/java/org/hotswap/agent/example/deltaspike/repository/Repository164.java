
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity164;

public abstract class Repository164 extends AbstractEntityRepository<Entity164, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity164 findByName(String name);
}
