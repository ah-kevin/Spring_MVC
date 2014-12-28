package org.hf520.test;

import org.apache.ibatis.session.SqlSession;
import org.hf520.entity.Dept;

import java.util.List;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestSelectList {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession=mysqlSessionUtil.getSession();
            List<Dept> list=sqlSession.selectList("findAll");
            for (Dept dept:list) {
                System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();;
        }
    }
}
