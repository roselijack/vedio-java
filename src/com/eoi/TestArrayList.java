package com.eoi;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {
    public  static ArrayList<String> test = new ArrayList<String>();



   /* public static void main(String[] args)
    {
        ArrayList<String> a = new ArrayList<String>();
        a.add("rose");
        a.add("rose2");
        a.set(0,"jack");
        a.remove(1);

        for (String a1:a
             ) {
            System.out.println(a1);
        }
        a.set(0,"one");
        for(int i = 0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }

        a.indexOf("")


    }*/

    public static String find(String args)
    {
        test.add("string1");
        int position = 0;
        position = test.indexOf(args);
        if(position>=0)
        {
            return test.get(position);
        }
        else
        {
            return null;
        }
    }

    public static void main(String[] args)
    {
        if(find("string")==null)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("find you!");
        }
        ArrayList<String> a = new ArrayList<String>();
        a.add("rose1");
        a.add("rose2");
        if(a.contains("rose"))
        {
            System.out.println("find rose");
        }
        else
        {
            System.out.println("not find rose");
        }
        String[] as = new String[a.size()];
        System.out.println(Arrays.toString(a.toArray(as)));



//

    }
}
