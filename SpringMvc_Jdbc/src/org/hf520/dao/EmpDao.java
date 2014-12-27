package org.hf520.dao;

import org.hf520.entiy.Emp;

import java.util.List;

/**
 * Created by kevin on 2014/12/27.
 */
public interface EmpDao {
    public void save(Emp emp);
    public Emp findById(int empno);
    public List<Emp> findAll();
}
