package com.bean;

public class Computer {
    private String mainboard;
    private String hdd;
    private String ram;

    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mainboard='" + mainboard + '\'' +
                ", hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    public Computer(String mainboard, String hdd, String ram) {
        this.mainboard = mainboard;
        this.hdd = hdd;
        this.ram = ram;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}
