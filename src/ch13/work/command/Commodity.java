package ch13.work.command;

import java.text.NumberFormat;
import java.util.Locale;

public class Commodity {

    private String name;
    private int price;

    private NumberFormat nf = NumberFormat.getIntegerInstance(Locale.US);


    public Commodity(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void buy(int qty){
        System.out.println("Commodity Bought");
        System.out.println(getTransactionDetails(qty));
    }
    public void sell(int qty){
        System.out.println("Commodity Sold");
        System.out.println(getTransactionDetails(qty));
    }

    private String getTransactionDetails(int qty){
        return "Name: "+ name + " Quantity: " + qty + " Value: $" + nf.format(price) +
                "\nOrder Total: " + (nf.format(price*qty));
    }
}
