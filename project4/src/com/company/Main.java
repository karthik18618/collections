package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(0,"Q");
        tm.put(1,"W");
        tm.put(2,"e");
        tm.put(3,"r");
        tm.put(4,"Q");
        tm.put(5,"W");
        tm.put(6,"e");
        tm.put(7,"r");
        tm.put(8,"j");
        tm.put(9,"k");
        tm.put(10,"n");
        tm.put(11,"u");
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(5));

    }
}
