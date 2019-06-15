package com.lala.controller;

import com.lala.dto.Emp;
import com.lala.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/listEmp")
    public String listEmp(Model model){
        List<Emp> emps = empService.findAllEmp();
        model.addAttribute("emps",emps);
        return "show";
    }

    @RequestMapping("/addEmp")
    @ResponseBody
    public boolean addEmp(@RequestBody Emp emp){
        empService.addEmp(emp);
        return true;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public boolean deleteEmpById(@PathVariable("id") int id){
        empService.deleteEmpById(id);
        return true;
    }

    @RequestMapping(value = "/updateEmp",method = RequestMethod.PUT)
    @ResponseBody
    public boolean updateEmp(@RequestBody Emp emp){
        empService.updateEmp(emp);
        return true;
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Emp findEmpById(@PathVariable("id") int id){
        return  empService.findEmpById(id);
    }
}
