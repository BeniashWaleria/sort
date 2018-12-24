package com.company;

import java.util.*;

public class JointArrays {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<10;i++)
        {
          list1.add(random.nextInt(30));
        }
        for(int i=0;i<10;i++)
        {
            list2.add(random.nextInt(30));
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println("////////////////////////////////////");
        Uniting(list1,list2);

    }
    public static void Uniting(List<Integer> list1, List<Integer> list2)
    {
        Set<Integer> TheFinalArray=new LinkedHashSet<>();
        TheFinalArray.addAll(list1);
        TheFinalArray.addAll(list2);
        System.out.println("The final array: "+TheFinalArray);
        list1.retainAll(list2);
        System.out.println(list1);
    }
}
