
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity227;

public abstract class Repository227 extends AbstractEntityRepository<Entity227, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity227 findByName(String name);
}
