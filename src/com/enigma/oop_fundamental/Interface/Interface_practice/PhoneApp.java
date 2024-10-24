package com.enigma.oop_fundamental.Interface.Interface_practice;

import com.enigma.oop_fundamental.Interface.Interface_practice.service.Phone;
import com.enigma.oop_fundamental.Interface.Interface_practice.serviceimpl.PhoneImpl;

public class PhoneApp {
    public static void main(String[] args) {
        Phone samsung = new PhoneImpl("samsung");
        PhoneUser farrel = new PhoneUser("farrel", samsung);

        farrel.getInfo();
        farrel.getPhone().powerOn();
        farrel.getPhone().volumeUp();
        farrel.getPhone().volumeUp();
        farrel.getPhone().volumeUp();
        farrel.getPhone().volumeUp();
        farrel.getPhone().volumeUp();
        farrel.getPhone().volumeDown();
        farrel.getPhone().powerOff();

    }
}
