package com.text;

public class text1 {
    private  fruit fruit;

    public text1(com.text.fruit fruit) {
        this.fruit = fruit;
    }

    public text1() {
    }

    @Override
    public String toString() {
        return "text1{" +
                "fruit=" + fruit +
                '}';
    }

    public com.text.fruit getFruit() {
        return fruit;
    }

    public void setFruit(com.text.fruit fruit) {
        this.fruit = fruit;
    }
}
