package com.lala.service;

import com.lala.dao.EmpMapper;
import com.lala.dto.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("empService")
public class EmpServiceImpl implements EmpService{
    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAllEmp() {
        return empMapper.findAllEmp();
    }

    @Override
    public void addEmp(Emp emp) {
        empMapper.addEmp(emp.getName(),emp.getSex(),emp.getJob(),
                emp.getSalary(),emp.getHiredate(),emp.getDeptno());
    }

    @Override
    public void deleteEmpById(int id) {
        empMapper.deleteEmp(id);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateEmp(emp.getId(),emp.getName(),emp.getSex(),emp.getJob(),
                emp.getSalary(),emp.getHiredate(),emp.getDeptno());
    }

    @Override
    public Emp findEmpById(int id) {
        return empMapper.findEmpById(id);
    }
}
