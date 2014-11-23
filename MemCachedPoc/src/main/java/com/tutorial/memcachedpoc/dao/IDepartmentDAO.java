/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tutorial.memcachedpoc.dao;

import com.tutorial.memcachedpoc.bean.Department;
import java.util.List;

/**
 *
 * @author Ana
 */
 
public interface IDepartmentDAO {
    public List<Department> retrieveDepartments();   
}