#!/usr/bin/python

repo = """
import java.io.Serializable;

import org.apache.deltaspike.data.api.AbstractEntityRepository;
import org.apache.deltaspike.data.api.criteria.CriteriaSupport;
import org.hotswap.agent.example.deltaspike.entity.Entity{0};

public abstract class Repository{0} extends AbstractEntityRepository<Entity{0}, Long> implements CriteriaSupport<Long>, Serializable
{
    public abstract Entity{0} findByName(String name);
}
"""

for i in range (300):
    with open("Repository{}.java".format(i), "w") as f:
        f.write(repo.replace('{0}', str(i)))

