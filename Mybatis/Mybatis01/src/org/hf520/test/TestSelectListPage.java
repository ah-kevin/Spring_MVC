package org.hf520.test;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.hf520.entity.Dept;

import java.util.List;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestSelectListPage {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession=mysqlSessionUtil.getSession();
            //定义一个分页器
            RowBounds rowBounds =new RowBounds(0,5);
            List<Dept> list=sqlSession.selectList("findAll",null,rowBounds);
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
