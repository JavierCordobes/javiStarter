package org.example.main;


import org.example.model.ATransaction;
import org.example.model.MasterTransaction;
import org.example.model.VisaTransaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {

        AtomicInteger sequence = new AtomicInteger(1);
        List<ATransaction> transactions = new ArrayList<ATransaction>();

        VisaTransaction visaTr1 = new VisaTransaction();

        visaTr1.setCountry("Uruguay");
        visaTr1.setAmount(BigDecimal.valueOf(1000));
        visaTr1.setCurrencyCode(840);
        visaTr1.setTransactionId(sequence.getAndIncrement());

        transactions.add(visaTr1);


        MasterTransaction masTr1 = new MasterTransaction();

        masTr1.setDate(20200626);
        masTr1.setAmount(BigDecimal.valueOf(1500));
        masTr1.setTransactionId(sequence.getAndIncrement());
        masTr1.setCurrencyCode(980);

        transactions.add(masTr1);

        for (ATransaction transaction : transactions) {
            System.out.println(transaction.getBrand());
            System.out.println(transaction.amountConversion());
        }

    }

}
