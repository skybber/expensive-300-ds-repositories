#!/usr/bin/python

entity = """
package org.hotswap.agent.example.deltaspike.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entity_{0}")
public class Entity{0} implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    /**
     * @return the id
     */
    public Long getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id)
    {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public int hashCode()
    {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Entity{0}))
        {
            return false;
        }
        Entity{0} other = (Entity{0}) obj;
        return id.equals(other.id);
    }

    @Override
    public String toString()
    {
        return "Entity{0} [id=" + id + "]";
    }
}
"""

for i in range (300):
    with open("Entity{}.java".format(i), "w") as f:
        f.write(entity.replace('{0}', str(i)))

