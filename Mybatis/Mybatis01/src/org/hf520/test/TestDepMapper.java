package org.hf520.test;

import org.apache.ibatis.session.SqlSession;
import org.hf520.entity.Dept;
import org.hf520.mapper.DeptMapper;

import java.util.List;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestDepMapper {
    public static void main(String[] args) {
        SqlSession sqlSession = null;
        try {
            sqlSession = mysqlSessionUtil.getSession();
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
            //Dept dept=mapper.findById(10);
            //System.out.println(dept.getDeptno()+" "+dept.getDname());
            List<Dept> list = mapper.findAll();
            for (Dept dept : list) {
                System.out.println(dept.getDeptno() + " " + dept.getDname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
            ;
        }
    }
}
