
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity112;

public abstract class Repository112 extends AbstractEntityRepository<Entity112, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity112 findByName(String name);
}
