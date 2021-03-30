
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity181;

public abstract class Repository181 extends AbstractEntityRepository<Entity181, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity181 findByName(String name);
}
