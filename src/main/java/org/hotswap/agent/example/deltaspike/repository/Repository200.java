
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity200;

public abstract class Repository200 extends AbstractEntityRepository<Entity200, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity200 findByName(String name);
}
