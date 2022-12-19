package com.company.InterfaceDemo;
//classes can extend classes nd abstract classes
public class Mobile implements Telephone {
    @Override
    public void ringNotification() {
        System.out.println("We can ring notification on pager if there is an emergency");
    }

    @Override
    public void makeCalls() {
        System.out.println("You can call using mobile phone");
    }

    @Override
    public void setAlarm() {
        System.out.println("Mobile phone can set alarms");
    }

    @Override
    public void makeCalculations() {
        System.out.println("Mobile phone can make calculations");
    }
}
