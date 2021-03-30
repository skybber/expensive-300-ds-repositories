
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity294;

public abstract class Repository294 extends AbstractEntityRepository<Entity294, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity294 findByName(String name);
}
