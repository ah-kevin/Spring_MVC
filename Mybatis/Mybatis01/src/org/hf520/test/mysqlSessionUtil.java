package org.hf520.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by kevin on 2014/12/28.
 */
public class mysqlSessionUtil {
    public static SqlSession getSession() throws IOException {
        String conf ="mysqlMapConfig.xml";
        Reader reader = Resources.getResourceAsReader(conf);
        SqlSessionFactoryBuilder factoryBuilder = new SqlSessionFactoryBuilder();
        //获取SqlSessionFactory 对象
        SqlSessionFactory factory = factoryBuilder.build(reader);
        SqlSession sqlSession=factory.openSession();//获取连接
        return sqlSession;
    }
}
