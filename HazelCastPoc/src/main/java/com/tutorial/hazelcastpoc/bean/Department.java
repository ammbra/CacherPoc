package com.tutorial.hazelcastpoc.bean;

import java.io.Serializable;

/**
 *
 * @author AnaMihalceanu
 */

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private int managerId;

    public Department() {
    }

    public Department(Integer id) {
        this.id = id;
    }

    public Department(Integer id, String name, int managerId) {
        this.id = id;
        this.name = name;
        this.managerId = managerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tutorial.crudwithjsp.model.Department[ id=" + id + " ]";
    }
    
}
