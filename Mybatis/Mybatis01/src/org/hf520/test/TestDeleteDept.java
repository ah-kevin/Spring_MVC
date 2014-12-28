package org.hf520.test;

import org.apache.ibatis.session.SqlSession;

/**
 * Created by kevin on 2014/12/28.
 */
public class TestDeleteDept {
    public static void main(String[] args) {
        SqlSession sqlSession=null;
        try {
            //sqlSession =SqlSessionUtil.getSession();
            sqlSession=mysqlSessionUtil.getSession();

            //使用
            sqlSession.delete("deleteDept",60);
            sqlSession.commit();//事物提交
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}


