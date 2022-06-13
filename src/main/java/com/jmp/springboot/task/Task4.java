package com.jmp.springboot.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@RestController
public class Task4 {
    private List<Employee> employees;

    @GetMapping(value = "/hired-employee")
    public String getHiredEmployeeSalary() {
        CompletionStage<Void> cf =
                CompletableFuture.runAsync(() -> getHiredEmployee());
        cf.thenRun(() -> getSalary());
        ((CompletableFuture) cf).join();
        return employees.toString();
    }

    private void getHiredEmployee() {
        employees = Data.getHiredEmployee();
    }

    private void getSalary() {
        for (Employee employee : employees) {
            employee.setSalary(Data.getSalary(employee.getId()));
        }
    }
}