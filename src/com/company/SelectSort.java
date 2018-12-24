package com.company;
import java.net.CookieHandler;
import java.util.*;
public class SelectSort {
    public static void main(String[] args) {
        int[] a=new int[] {2,3,6,1,2,4,2};
    }
    public static void BubbleSort(int[] mas) {
        int len = mas.length;
int temp=0, counter;
do {
    counter = 0;
    for (int i = 0; i < len - 1; i++) {

        if (mas[i] > mas[i + 1]) {
            temp = mas[i];
            mas[i] = mas[i + 1];
            mas[i + 1] = temp;
            counter++;
        }

    }
}

while(counter>0);
        for (int index : mas) {
            System.out.print(index + ",");
        }
    }
    public static void InSort(int[] mas) {
        int len = mas.length;
        int element, indexToInsert;
        //пройти по массиву
        for (int i = 0; i < len; i++) {
            element = mas[i];
            indexToInsert = i;
            while (indexToInsert > 0 && mas[indexToInsert - 1] > element) {
                mas[indexToInsert] = mas[indexToInsert - 1];
                indexToInsert--;
                mas[indexToInsert] = element;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(mas.length);
    }
}




