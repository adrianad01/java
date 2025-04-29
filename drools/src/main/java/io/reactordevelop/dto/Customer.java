package io.reactordevelop.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    private String code;
    private String fullName;
    private int numberOfPurchases;
    private double totalPurchases;
    private String category;

    public Customer() {
        this.category = "Uncategorized";
    }

    public Customer(String code, String fullName, int numberOfPurchases, double totalPurchases) {
        this.code = code;
        this.fullName = fullName;
        this.numberOfPurchases = numberOfPurchases;
        this.totalPurchases = totalPurchases;
        this.category = "Uncategorized";
    }

    @Override
    public String toString() {
        return "Customer{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", numberOfPurchases=" + numberOfPurchases +
                ", totalPurchases=" + totalPurchases +
                ", category='" + category + '\'' +
                '}';
    }
}
