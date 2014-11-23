/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tutorial.cacherpoc;

import com.tutorial.memcachedpoc.bean.Employee;
import com.tutorial.memcachedpoc.dao.IEmployeeDAO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;

/**
 *
 * @author Ana
 */

@WebServlet("/MemCachedServlet")
public class MemCachedServlet extends HttpServlet {
   private static Logger logger = Logger.getLogger(MemCachedServlet.class);

    @EJB(beanName="memcachedDAO")
    IEmployeeDAO employeeDAO;
    private static final String LIST_USER = "/listEmployee.jsp";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String forward= LIST_USER;
        List<Employee> results = new ArrayList<Employee>();
         for (int i = 0; i < 10; i++) {
            for (Employee emp : employeeDAO.getEmployees()) {
                logger.debug(emp);
                results.add(emp);
            }
            
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                logger.error(e, e);
            }
        }
        req.setAttribute("employees", results);
        RequestDispatcher view = req.getRequestDispatcher(forward);
        view.forward(req, resp);
    }
    
}
