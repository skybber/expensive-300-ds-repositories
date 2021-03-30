
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity179;

public abstract class Repository179 extends AbstractEntityRepository<Entity179, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity179 findByName(String name);
}
