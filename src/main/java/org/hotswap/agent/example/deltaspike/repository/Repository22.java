
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity22;

public abstract class Repository22 extends AbstractEntityRepository<Entity22, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity22 findByName(String name);
}
