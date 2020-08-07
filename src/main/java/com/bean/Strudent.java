package com.bean;

import org.springframework.stereotype.Component;
@Component
public class Strudent {
    private  String name;
    private Computer computer;
    private  Mobilephone mobilephone;


    public Strudent() {
        System.out.println("heh");
    }

    public Strudent(String name, Computer computer, Mobilephone mobilephone) {
        this.name = name;
        this.computer = computer;
        this.mobilephone = mobilephone;
    }

    @Override
    public String toString() {
        return "Strudent{" +
                "name='" + name + '\'' +
                ", computer=" + computer +
                ", mobilephone=" + mobilephone +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public Mobilephone getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(Mobilephone mobilephone) {
        this.mobilephone = mobilephone;
    }
}
