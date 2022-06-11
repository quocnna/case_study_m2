package model;

import util.ConstantUtil.RentType;

public abstract class Facility {
    private String code;
    private String name;
    private double areaUsed;
    private double price;
    private int maxPeople;
    private RentType rentType;

    public Facility() {
    }

    public Facility(String code, String name, double areaUsed, double price, int maxPeople, RentType rentType) {
        this.code = code;
        this.name = name;
        this.areaUsed = areaUsed;
        this.price = price;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", areaUsed=" + areaUsed +
                ", price=" + price +
                ", maxPeople=" + maxPeople +
                ", rentType=" + rentType +
                '}';
    }
}
