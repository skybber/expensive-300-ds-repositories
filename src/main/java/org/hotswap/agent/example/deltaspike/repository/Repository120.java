
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity120;

public abstract class Repository120 extends AbstractEntityRepository<Entity120, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity120 findByName(String name);
}
