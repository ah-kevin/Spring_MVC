package org.hf520.entity;

import java.io.Serializable;

/**
 * Created by kevin on 2014/12/28.
 *
 */

public class Dept implements Serializable {

   private  Integer deptno;
    private String dname;
    private String loc;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public Integer getDeptno() {

        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}
