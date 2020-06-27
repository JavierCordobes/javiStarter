package org.example.model;

import org.example.interfaces.ICalculator;

import java.math.BigDecimal;


public abstract class ATransaction implements ICalculator {

    //atributos
    private long transactionId;

    private BigDecimal amount;

    private int currencyCode;

    //constructor
    public ATransaction(long transactionId, BigDecimal amount, int currencyCode) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.currencyCode = currencyCode;
    }

    public ATransaction() {
    }

    public BigDecimal amountConversion() {

        BigDecimal result;

        switch (currencyCode) {
            case 840:
                result = this.amount.multiply(BigDecimal.valueOf(43.50));
                break;
            case 980:
                result = this.amount.multiply(BigDecimal.valueOf(10));
                break;
            default:
                result = BigDecimal.ZERO;
        }

        return result;
    }


    // getter y setter
    public abstract String getBrand();

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }
}
