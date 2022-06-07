package model;

import util.ConstantUtil;
import util.ConstantUtil.TypeCustomer;

public class Customer extends Person {
    private TypeCustomer typeCustomer;

    public Customer(String fullName, String birthday, ConstantUtil.Gender gender, String phone, String email, String address, TypeCustomer typeCustomer) {
        super(fullName, birthday, gender, phone, email, address);
        this.typeCustomer = typeCustomer;
    }

    public Customer(String code, String fullName, String birthday, ConstantUtil.Gender gender, String phone, String email, String address, TypeCustomer typeCustomer) {
        super(code, fullName, birthday, gender, phone, email, address);
        this.typeCustomer = typeCustomer;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public boolean equals(Object o) {
        return getCode().equalsIgnoreCase(((Customer) o).getCode());
    }

    @Override
    public String toString() {
        return super.toString() + "Customer{" +
                "typeCustomer=" + typeCustomer +
                "} ";
    }
}
