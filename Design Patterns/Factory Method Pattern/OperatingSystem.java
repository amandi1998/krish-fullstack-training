package com.company.phone;

public class OperatingSystem {

//    public OS getInstance(String str){
//        if(str.equals("Open"))
//            return new Android();
//        else if (str.equals("Closed"))
//            return new IOS();
//        else
//            return new Windows();
//
//    }

    public OS getInstance(String str) {
        if(str.equals("Open"))
            return new Android();
        else if (str.equals("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
