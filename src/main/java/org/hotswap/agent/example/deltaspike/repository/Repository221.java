
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity221;

public abstract class Repository221 extends AbstractEntityRepository<Entity221, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity221 findByName(String name);
}
