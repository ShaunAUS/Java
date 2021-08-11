package com.example.FuckApi.controller;

import java.util.HashSet;
import java.util.TreeSet;

public class Test2 {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String From ="b";
        String to="d";

        set.add("abc"); set.add("alien"); set.add("bat");
        set.add("car"); set.add("Car"); set.add("disco");
        set.add("dance");

        System.out.println(set);
        System.out.println("range search : from" + From +" to "+ to);
        System.out.println("result1:"+set.subSet(From,to));
        System.out.println("result2:"+set.subSet(From,to+"zzz"));
    }
}
