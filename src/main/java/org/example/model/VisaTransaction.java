package org.example.model;

public class VisaTransaction extends ATransaction {

    private String country;

    public String getBrand() {
        return "Soy Visa";

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
