package org.hf520.test;

import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestSqlsession {

    public static void main(String[] args) throws IOException {
        SqlSession sqlSession=SqlSessionUtil.getSession();
        System.out.println(sqlSession);
        sqlSession.close();//释放连接
    }
}
