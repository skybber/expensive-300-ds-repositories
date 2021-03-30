
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity143;

public abstract class Repository143 extends AbstractEntityRepository<Entity143, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity143 findByName(String name);
}
