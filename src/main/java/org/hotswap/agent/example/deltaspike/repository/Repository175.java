
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity175;

public abstract class Repository175 extends AbstractEntityRepository<Entity175, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity175 findByName(String name);
}
