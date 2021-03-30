
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity121;

public abstract class Repository121 extends AbstractEntityRepository<Entity121, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity121 findByName(String name);
}
