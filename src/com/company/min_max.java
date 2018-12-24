package com.company;

public class min_max {
    public static void Min_Max(int[] a){
        int min=a[0],max=a[0];
for(int i=0; i<a.length;i++){
    if(a[i]<min)
    {
        min=a[i];
    }
    else if(a[i]>max)
    {
        max=a[i];
    }
}
        System.out.println("\nmin: "+min+"\nmax: "+max);
    }

}
