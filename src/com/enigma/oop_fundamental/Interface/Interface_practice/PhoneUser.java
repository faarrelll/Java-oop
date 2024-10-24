package com.enigma.oop_fundamental.Interface.Interface_practice;

import com.enigma.oop_fundamental.Interface.Interface_practice.service.Phone;
import com.enigma.oop_fundamental.Interface.Interface_practice.serviceimpl.PhoneImpl;

public class PhoneUser {
    private String name;
    private Phone phone;

    public PhoneUser(String name, Phone phone) {
        setName(name);
        setPhone(phone);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void getInfo(){
        System.out.println("Name: "+name);
        System.out.println("Phone: "+((PhoneImpl)phone).getName());
    }
}
