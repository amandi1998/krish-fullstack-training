package com.company;

import com.company.phone.Android;
import com.company.phone.OS;
import com.company.phone.OperatingSystem;
import com.company.phone.Windows;


public class Main {

    public static void main(String[] args) {
	// write your code here

        OperatingSystem osf = new OperatingSystem();
        OS obj = osf.getInstance("Hi Amandi");
     //   OS obj = new Windows();
        obj.spec();
    }
}
