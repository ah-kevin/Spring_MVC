package org.hf520.test;

import org.apache.ibatis.session.SqlSession;

import java.util.Map;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestSelectMap {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            sqlSession=mysqlSessionUtil.getSession();
            Map map=sqlSession.selectOne("findMap",30);
            //在此处字段名必须大写,带小写敏感
            System.out.println(map.get("delano"));
            System.out.println(map.get("dname"));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();;
        }
    }
}