/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tutorial.hazelcastpoc.dao;

import com.tutorial.hazelcastpoc.bean.Employee;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ana
 */
@Local
public interface IEmployeeDAO {
        public List<Employee> getEmployees();   
}
