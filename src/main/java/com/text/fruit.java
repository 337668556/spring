package com.text;

public class fruit {
    private String a;

    public fruit(String a) {
        this.a = a;
    }

    public fruit() {
    }

    @Override
    public String toString() {
        return "fruit{" +
                "a='" + a + '\'' +
                '}';
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }


}
