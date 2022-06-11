package model;

import java.util.Objects;

public class Contract {
    private String contractCode;
    private String bookingCode;
    private double downPayment;
    private double totalPayment;
    private String customerCode;

    public Contract(String contractCode, String bookingCode, double downPayment, double totalPayment, String customerCode) {
        this.contractCode = contractCode;
        this.bookingCode = bookingCode;
        this.downPayment = downPayment;
        this.totalPayment = totalPayment;
        this.customerCode = customerCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return contractCode.equals(contract.contractCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractCode);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractCode='" + contractCode + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", downPayment=" + downPayment +
                ", totalPayment=" + totalPayment +
                ", customerCode='" + customerCode + '\'' +
                '}';
    }
}
