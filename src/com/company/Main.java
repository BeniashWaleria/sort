package com.company;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
      List<Integer> list=new ArrayList<>();
        CreateArray(list);
       OutAndDeleteRepeat(list);
       FrequencyElements(list,7);
    }
    public static void CreateArray(List<Integer> a) {
       a.add(3);
       a.add(7);
       a.add(9);
       a.add(8);
       a.add(9);
       a.add(2);
       a.add(9);
        System.out.print("The initial array: "+a.toString()+"\n");
        System.out.println("Size of this array:" + a.size());
    }
    //delete
    public static void Del(List<Integer> a) {
     // удалить определенное значение
        int k;
        try {
            System.out.println("ВВедите число для удаления");
            k = System.in.read();
            if (a.contains(k)) {
                a.remove(k);
            }
        }
catch (IOException e){
    System.out.println(e);
}        /*int len = a.length;
        int searchName = 0, g = 0, h = 0, i, j;
        for (i = 0; i < len; i++) {
            if (a[i] > searchName)   // условие на удаление элемента массива
            {
                h++;
                System.out.print("element " + h + ":");
                System.out.print(+a[i] + "\t");
                len--;         // уменьшаем количество
                for (j = i; j < len; j++) // сдвиг влево
                    a[j] = a[j + 1];
                i--; // Снова просматриваем i-й элемен
            }
        }
        int[] arrayWithoutDuplicates = Arrays.copyOf(a, len);
        System.out.println("\n");
        System.out.println(len);
        for (int arrayWithoutDuplicate : arrayWithoutDuplicates) {
            System.out.print(arrayWithoutDuplicate + "\t");

        }*/

    }
    //duplicates
    public static void OutAndDeleteRepeat(List<Integer> list) {
        final boolean[] booleans = new boolean[list.size()];
        Set<Integer> indicesList = new LinkedHashSet<>();
        for (int i = 0; i < list.size() - 1; i++) {
            while (booleans[i]) i++;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    booleans[j] = true;
                    indicesList.add(i);
                    indicesList.add(j);
                }
            }
        }
        Set<Integer> newList=new LinkedHashSet<>();
        newList.addAll(list);
        System.out.println("The position of repetition: "+ indicesList);
        System.out.println("Without duplicates: "+newList);

    }
    //frequency
    public static void FrequencyElements(List<Integer> list,int a)
    { int b=Collections.frequency(list,a);
        System.out.println("The frequency: "+b);
List<Integer> positions=new ArrayList<>();
       for(int i=0;i<list.size();i++)
       {
           if(list.get(i).equals(a))
           {
               positions.add(i+1);
           }
       }
        System.out.println(positions);
    }
    public static void SelectSort(int[] mas) {
        int len = mas.length;
        int min, temp;
        for (int i = 0; i < len; i++) {
            min = i;
            for (int scan = i; scan < mas.length; scan++) {
                if (mas[scan] < mas[min])
                    min = scan;
            }
            temp = mas[min];
            mas[min] = mas[i];
            mas[i] = temp;
        }
        for (int index : mas) {
            System.out.print(index + ",");
        }

    }
}