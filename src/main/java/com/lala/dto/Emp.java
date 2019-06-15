package com.lala.dto;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private int id;
    private String name;
    private String sex;
    private String job;
    private double salary;
    private Date hiredate;
    private int deptno;

    public Emp() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public Emp(int id, String name, String sex, String job, double salary, Date hiredate, int deptno) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.job = job;
        this.salary = salary;
        this.hiredate = hiredate;
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                ", deptno=" + deptno +
                '}';
    }
}
