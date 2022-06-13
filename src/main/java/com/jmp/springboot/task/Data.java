package com.jmp.springboot.task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private static List<Employee> hiredEmployee;
    private static Map<Integer, Integer> salary;

    static {
        Employee employee1 = new Employee(1, "One");
        Employee employee2 = new Employee(2, "Two");
        Employee employee3 = new Employee(3, "Three");
        Employee employee4 = new Employee(4, "Four");
        Employee employee5 = new Employee(5, "Five");
        Employee employee6 = new Employee(6, "Six");
        Employee employee7 = new Employee(7, "Seven");
        Employee employee8 = new Employee(8, "Eight");
        Employee employee9 = new Employee(9, "Nine");
        Employee employee10 = new Employee(10, "Ten");
        hiredEmployee = Arrays.asList(
                employee1,
                employee2,
                employee3,
                employee4,
                employee5,
                employee6,
                employee7,
                employee8,
                employee9,
                employee10);

        salary = new HashMap<>();
        salary.put(1, 1000);
        salary.put(2, 2000);
        salary.put(3, 3000);
        salary.put(4, 4000);
        salary.put(5, 5000);
        salary.put(6, 6000);
        salary.put(7, 7000);
        salary.put(8, 8000);
        salary.put(9, 9000);
        salary.put(10, 10000);
    }

    public static List<Employee> getHiredEmployee() {
        return hiredEmployee;
    }

    public static int getSalary(int id) {
        return salary.get(id);
    }
}
