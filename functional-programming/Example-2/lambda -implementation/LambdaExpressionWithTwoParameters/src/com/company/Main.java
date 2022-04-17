package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


       // Ola o1 = new Ola();

//      Cab cab = (String source, String destination)->System.out.println("Ola is booked  from" + source + "To" + destination);
//        cab.bookCab("train","Kandy");

        Cab cab = ( source,  destination)->System.out.println("Ola is booked  from" + source + "To" + destination);
        cab.bookCab("train","Kandy");  // -->  This is most optimized way of lambda Expressions.

    }
}
