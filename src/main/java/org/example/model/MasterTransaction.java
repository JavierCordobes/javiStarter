package org.example.model;

public class MasterTransaction extends ATransaction {

    private long date;

    public String getBrand() {
        return "Soy Master";
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
