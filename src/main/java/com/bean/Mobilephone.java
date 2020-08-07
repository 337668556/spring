package com.bean;

public class Mobilephone {
    private String cpu;
    private  String ram;


    public Mobilephone() {
    }

    public Mobilephone(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Mobilephone{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
