package com.company.InterfaceDemo;

//interface is a contract between interface and class which is implementing it
//in interface u don't have to write public its by default public
//1 class can implement multiple interfaces in interfaces but not in classes
//we cannot make object of interfaces or constructors too

public class TestMain {
    public static void main(String[] args) {
        Telephone mobile = new Mobile();
        mobile.ringNotification();
        mobile.makeCalculations();
        mobile.setAlarm();
        mobile.makeCalls();
    }
}
