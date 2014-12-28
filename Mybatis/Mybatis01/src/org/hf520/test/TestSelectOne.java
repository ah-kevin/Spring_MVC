package org.hf520.test;

import org.apache.ibatis.session.SqlSession;
import org.hf520.entity.Dept;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestSelectOne {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession=mysqlSessionUtil.getSession();
            Dept dept=sqlSession.selectOne("findById", 30);
            System.out.println(dept.getDeptno()+" "+dept.getDname()+" "+dept.getLoc());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();;
        }
    }
}
