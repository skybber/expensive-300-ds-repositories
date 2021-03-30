
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity289;

public abstract class Repository289 extends AbstractEntityRepository<Entity289, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity289 findByName(String name);
}
