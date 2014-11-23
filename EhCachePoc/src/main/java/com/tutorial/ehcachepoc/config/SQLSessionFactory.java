/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tutorial.ehcachepoc.config;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 
/**
 *
 * @author Ana
 */
public class SQLSessionFactory {

 
    private static final SqlSessionFactory FACTORY;
 
    static {
        try {
            Reader reader = Resources.getResourceAsReader("com/tutorial/ehcachepoc/xml/Configuration.xml");
            FACTORY = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e){
            throw new RuntimeException("Fatal Error.  Cause: " + e, e);
        }
    }
 
    public static SqlSessionFactory getSqlSessionFactory() {
        return FACTORY;
    }
}
