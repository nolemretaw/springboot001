package com.lala.service;

import com.lala.dto.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> findAllEmp();
    public void addEmp(Emp emp);
    public void deleteEmpById(int id);
    public void updateEmp(Emp emp);
    public Emp findEmpById(int id);
}
