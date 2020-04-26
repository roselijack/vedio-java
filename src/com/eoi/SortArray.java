package com.eoi;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static int[] getIntegers(int length)
    {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[length];
        System.out.println("please input numbers:");
        for(int i=0;i<length;i++)
        {
            a[i] = scanner.nextInt();
        }
        return a;

    }
    public static void printArray(int[] a)
    {
        for (int i:a
             ) {
            System.out.println(i);
        }

    }
    public static int[] sortIntegers(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j + 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
        return a;

    }
/*    2, 5,5,8,
    5, 2,8,5,
    8, 8,2,2,
    1, 1,1,1*/

    public static int[] sortIntegers_b(int[] a)
    {
        int[] b = Arrays.copyOf(a,a.length);
        boolean flag = true;
        while (flag)
        {
            flag = false;
            for(int i=0;i<a.length-1;i++)
            {
                if(a[i]<a[i+1])
                {
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                   flag = true;
                }
            }
        }
        return a;

    }

    public static void main(String[] args)
    {
        int[] a = new int[5];
        a = getIntegers(5);
        printArray(a);
        int[] b = new int[5];
       /*int[] a = {-1,10,8,2,5,4};*/
       b = sortIntegers_b(a);
        for (int i:b
             ) {
            System.out.println(i);
        }
       System.out.println();

    }
}
