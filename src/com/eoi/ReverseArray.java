package com.eoi;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] a)
    {
        for(int i=0;i<a.length/2;i++)
        {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args)
    {
        int a[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        reverse(a);


    }
}
