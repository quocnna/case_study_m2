package model;

import util.ConstantUtil;
import util.ConstantUtil.Degree;
import util.ConstantUtil.Position;

public class Employee extends Person {
    private Degree degree;
    private Position position;
    private double salary;

    public Employee() {
    }

    public Employee(String code, String fullName, String birthday, ConstantUtil.Gender gender, String phone, String email, String address, Degree degree, Position position, double salary) {
        super(code, fullName, birthday, gender, phone, email, address);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        String code = ((Employee) obj).getCode();
        return getCode().equalsIgnoreCase(code);
    }

    @Override
    public String toString() {
        return super.toString() + "Employee{" +
                "degree=" + degree +
                ", position=" + position +
                ", salary=" + salary +
                "} ";
    }
}
