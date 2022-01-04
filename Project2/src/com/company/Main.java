package com.company;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args)
    {
        PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
        p1.add(55);
        p1.add(45);
        p1.add(60);
        p1.add(65);
        p1.add(5);
        System.out.println(p1);
      System.out.println(p1.peek());
      System.out.println(p1.remove( 5));
      System.out.println(p1);
      System.out.println(p1.poll());
      System.out.println(p1);
      System.out.println(p1.poll());
      System.out.println(p1);
    }
}
