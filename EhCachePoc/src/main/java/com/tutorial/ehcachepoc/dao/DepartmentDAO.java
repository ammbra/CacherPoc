/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial.ehcachepoc.dao;

import com.tutorial.ehcachepoc.config.SQLSessionFactory;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

/**
 *
 * @author Ana
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DepartmentDAO {

    private static Logger logger = Logger.getLogger(DepartmentDAO.class);
    private SqlSessionFactory sqlSessionFactory;

   @PostConstruct
     public void init() {
        sqlSessionFactory = SQLSessionFactory.getSqlSessionFactory();
    }


}
