package com.lala.dao;

import com.lala.dto.Emp;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select * from emp")
    public List<Emp> findAllEmp();

    @Insert("insert into emp(name,sex,job,salary,hiredate,deptno) values(#{name},#{sex},#{job},#{salary},#{hiredate},#{deptno})")
    public void addEmp(@Param("name") String name, @Param("sex") String sex, @Param("job") String job,
                       @Param("salary") double salary,@Param("hiredate") Date hiredate,@Param("deptno") int deptno);

    @Delete("delete from emp where id=#{id}")
    public void deleteEmp(@Param("id") int id);

    @Update("update emp set name =#{name},sex=#{sex},job=#{job},salary=#{salary},hiredate=#{hiredate},deptno=#{deptno} where id=#{id}")
    public void updateEmp(@Param("id") int id,@Param("name") String name,@Param("sex") String sex,@Param("job") String job,
                        @Param("salary") double salary,@Param("hiredate") Date hiredate,@Param("deptno") int deptno);

    @Select("select * from emp where id=#{id}")
    public Emp findEmpById(@Param("id") int id);
}















