package org.hf520.dao;

import org.hf520.entiy.Emp;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by kevin on 2014/12/27.
 */
public class JdbcEmpDao extends JdbcDaoSupport implements EmpDao {

    @Override
    public void save(Emp emp) {
        String sql ="insert into emp(empno,ename,job,mgr,hiredate,SAL,comm,deptno) values(?,?,?,?,?,?,?,?)";
        Object[] params ={
                emp.getEmpno(),
                emp.getEname(),
                emp.getJob(),
                emp.getMgr(),
                emp.getHiredate(),
                emp.getSal(),
                emp.getComm(),
                emp.getDeptno()
        };
        super.getJdbcTemplate().update(sql,params);
    }

    @Override
    public Emp findById(int empno) {
        return null;
    }

    @Override
    public List<Emp> findAll() {
        return null;
    }
}
