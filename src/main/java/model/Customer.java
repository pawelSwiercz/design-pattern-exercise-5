package model;

public class Customer {
    private String fullName;

    @Override
    public String toString() {
        return fullName;
    }

    public Customer(String fullName) {
        this.fullName = fullName;
    }
}
