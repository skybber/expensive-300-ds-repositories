
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity78;

public abstract class Repository78 extends AbstractEntityRepository<Entity78, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity78 findByName(String name);
}
