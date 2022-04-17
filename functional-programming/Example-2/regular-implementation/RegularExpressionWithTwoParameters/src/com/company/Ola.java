package com.company;

public class Ola  implements  Cab{

    @Override
    public void bookCab(String source, String destination) {
        System.out.println("Ola is booked  from" + source + "To" + destination);
    }
}
