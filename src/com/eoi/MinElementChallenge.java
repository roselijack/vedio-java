package com.eoi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    public static int[] readIntegers(int count)
    {
        int[] a = new int[count];
        System.out.println("please input "+count+" numbers:");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<count;i++)
        {
            a[i] = scanner.nextInt();
        }
        return a;
    }
    public static int findMin(int[] a)
    {
        int[] b = Arrays.copyOf(a,a.length);
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]<a[i+1])
            {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        return a[a.length-1];

    }

    public static int findMin_2(int[] a)
    {
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<a.length-1;i++)
        {
           if(a[i]<minimum)
           {
               minimum = a[i];
           }
        }
        return minimum;


    }

    public static void main(String[] args)
    {
        System.out.println(findMin_2(readIntegers(5)));
    }
//    100,20,20,20,
//    20,100,30,30,
//    30,30,100,10,
//    10,10,10,100. 最大最后
//
//    100，100，100，
//    20，30，30，
//    30，20，20，
//    10，10，10， 最小最后。
}
