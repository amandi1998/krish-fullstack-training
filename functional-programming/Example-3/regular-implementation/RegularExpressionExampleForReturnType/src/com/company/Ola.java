package com.company;

public class Ola implements Cab {

    public String bookCab(String source, String destination){
                System.out.println("Ola is booked  from" + source + "To" + destination);
                return ("Price : Rs.5000.00");
    }
}
