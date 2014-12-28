package org.hf520.test;

import org.apache.ibatis.session.SqlSession;
import org.hf520.entity.Dept;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestAddDept {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            //sqlSession =SqlSessionUtil.getSession();
            sqlSession=mysqlSessionUtil.getSession();
            Dept dept=new Dept();
            dept.setDeptno(30);
            dept.setDname("开发一部");
            dept.setLoc("北京");
            //使用
            sqlSession.insert("addDept", dept);
            sqlSession.commit();//事物提交
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}
