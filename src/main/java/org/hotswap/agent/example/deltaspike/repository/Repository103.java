
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity103;

public abstract class Repository103 extends AbstractEntityRepository<Entity103, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity103 findByName(String name);
}
