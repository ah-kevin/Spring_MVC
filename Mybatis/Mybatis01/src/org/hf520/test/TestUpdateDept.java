package org.hf520.test;

import org.apache.ibatis.session.SqlSession;
import org.hf520.entity.Dept;

import java.io.IOException;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestUpdateDept {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession =mysqlSessionUtil.getSession();
            Dept dept =new Dept();
            dept.setDeptno(10);
            dept.setDname("shanhai");
            dept.setLoc("niubi");
            sqlSession.update("updateDept",dept);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
