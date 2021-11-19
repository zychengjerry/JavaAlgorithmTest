package BasicCode_05综合练习;

import java.util.*;

public class Q45_编写个人所得税计算程序_List_add_get {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        //write your code here......
        Employee employee1 = new Employee("小明",2500);
        Employee employee2 = new Employee("小军",8000);
        Employee employee3 = new Employee("小红",100000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        for (Employee employee : employees) {
            double tax = 0.0;
            double taxIncome = employee.getSalary() - 3500;
            if (taxIncome <= 0) {
                tax = 0.0;
            } else if (taxIncome <= 1500) {
                tax = taxIncome * 0.03;
            } else if (taxIncome <= 4500) {
                tax = taxIncome * 0.1 - 105;
            } else if (taxIncome <= 9000) {
                tax = taxIncome * 0.2 - 555;
            } else if (taxIncome <= 35000) {
                tax = taxIncome * 0.25 - 1005;
            } else if (taxIncome <= 55000) {
                tax = taxIncome * 0.3 - 2755;
            } else if (taxIncome <= 80000) {
                tax = taxIncome * 0.35 - 5505;
            } else {
                tax = taxIncome * 0.45 - 13505;
            }
            System.out.println(employee.getName() + "应该缴纳的个人所得税是：" + tax);
        }

    }
}
class Employee{
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}