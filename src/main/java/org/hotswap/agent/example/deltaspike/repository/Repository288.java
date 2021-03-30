
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity288;

public abstract class Repository288 extends AbstractEntityRepository<Entity288, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity288 findByName(String name);
}
