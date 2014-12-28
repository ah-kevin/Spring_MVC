package org.hf520.mapper;

import org.hf520.entity.Dept;

import java.util.List;

/**
 * Created by kevin on 2014/12/28.
 */
public interface DeptMapper {
    public Dept findById(int id);
    public List<Dept> findAll();

}
