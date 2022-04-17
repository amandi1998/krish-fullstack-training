package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cab cab = (String source, String destination) -> {
            System.out.println("Ola is booked  from" + source + "To" + destination);
            return ("Price : Rs.5000.00");};
        
        System.out.println( cab.bookCab("Car", "Colombo"));

    }
}
