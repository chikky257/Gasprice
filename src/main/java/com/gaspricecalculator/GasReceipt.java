package com.gaspricecalculator;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GasReceipt {
    private double gallonsFilled;
    private double pricePerGallon;
    private double totalPrice;
    private Date date;

    public GasReceipt(double gallonsFilled, double pricePerGallon, double totalPrice) {
        this.gallonsFilled = gallonsFilled;
        this.pricePerGallon = pricePerGallon;
        this.totalPrice = totalPrice;
        this.date = new Date();
    }

    public void printReceipt() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(date);

        System.out.println("Gas Receipt");
        System.out.println("Date: " + formattedDate);
        System.out.println("Gallons filled: " + gallonsFilled + " gallons");
        System.out.println("Price per gallon: $" + pricePerGallon);
        System.out.println("Total price: $" + totalPrice);
    }

    @Override
    public String toString() {
        return "GasReceipt{" +
                "gallonsFilled=" + gallonsFilled +
                ", pricePerGallon=" + pricePerGallon +
                ", totalPrice=" + totalPrice +
                ", date=" + date +
                '}';
    }
}
