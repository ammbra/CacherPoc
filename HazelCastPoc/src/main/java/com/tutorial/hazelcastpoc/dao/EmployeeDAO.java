/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.hazelcastpoc.dao;

import com.tutorial.hazelcastpoc.bean.Employee;
import com.tutorial.hazelcastpoc.config.SQLSessionFactory;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

/**
 *
 * @author Ana
 */
@Stateless(name="hazelcastDAO")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class EmployeeDAO implements IEmployeeDAO {

    private static Logger logger = Logger.getLogger(EmployeeDAO.class);
    private SqlSessionFactory sqlSessionFactory;

    @PostConstruct
     public void init() {
        sqlSessionFactory = SQLSessionFactory.getSqlSessionFactory();
    }

    @Override
    public List<Employee> getEmployees() {
        logger.info("Getting employees.....");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Employee> results = sqlSession.selectList("retrieveEmployees");
        sqlSession.close();
        return results;
    }
}
