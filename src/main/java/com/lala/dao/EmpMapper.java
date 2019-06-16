package com.lala.dao;

import com.lala.annotation.MybatisAnnotation;
import com.lala.dto.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository("empMapper")
public @MybatisAnnotation interface EmpMapper {

    public List<Emp> findAllEmp();

    public void addEmp(Emp emp);

    public void deleteEmp(int id);

    public void updateEmp(Emp emp);

    public Emp findEmpById(int id);
}















