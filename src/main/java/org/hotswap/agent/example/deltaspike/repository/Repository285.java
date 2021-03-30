
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity285;

public abstract class Repository285 extends AbstractEntityRepository<Entity285, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity285 findByName(String name);
}
