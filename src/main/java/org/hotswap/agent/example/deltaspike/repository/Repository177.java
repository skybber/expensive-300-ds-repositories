
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity177;

public abstract class Repository177 extends AbstractEntityRepository<Entity177, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity177 findByName(String name);
}
