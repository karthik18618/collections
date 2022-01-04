package com.company;

import java.util.LinkedHashMap;
import java.util.*;

public class Main {

    public static void main(String[] args)
    {

	LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5);
    lhm.put(1,"KARTHIK");
    lhm.put(2,"Nani");
    lhm.put(3,"CH");
    String s=lhm.get(2);
    lhm.forEach((k,v)->System.out.println(k+" "+v));
    System.out.println(lhm);
    }
}
