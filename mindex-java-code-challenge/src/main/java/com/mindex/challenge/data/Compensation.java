package com.mindex.challenge.data;

import org.springframework.data.annotation.Id;

public class Compensation {
    @Id
    private Employee employee;
    private int salary;

    private String effectiveDate;

    public Compensation() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        return "Compensation{" +
                ", employee=" + employee.getEmployeeId() +
                ", salary=" + salary +
                ", effectiveDate='" + effectiveDate + '\'' +
                '}';
    }
}
