package com.text;

import java.util.ArrayList;
import java.util.List;

public class sd {
    public static void main(String[] args) {
        List<text1> list=new ArrayList<text1>();
        text1 text = new text1();
        fruit fr= new fruit("S");
        text.setFruit(fr);

        list.add(text);
        for (text1 te:list){

    System.out.println(te.getFruit().getA());
    }

    }
}
