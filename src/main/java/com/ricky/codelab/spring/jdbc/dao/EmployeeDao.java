package com.ricky.codelab.spring.jdbc.dao;

import com.ricky.codelab.spring.domain.Employee;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-19 17:43
 */
public interface EmployeeDao {

    public int insert(Employee employee);
    public Employee findById(long id);

}
