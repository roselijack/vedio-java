package com.eoi;

public class CarAnalogy {
    public void accelerate()
    {
        System.out.println("accelerate");
    }
    public void brake()
    {
        System.out.println("brake");
    }
    public void startEngineer()
    {
        System.out.println("startEngineer");
    }
    private int enginnumber;
    private int cylinders;
    private int wheels;

    public static void main(String[] args)
    {
        CarAnalogy benchi1 = new benchi();
        benchi1.startEngineer();
        CarAnalogy aodi = new aodi();
        aodi.startEngineer();
        CarAnalogy qq = new qq();
        //qq.startEnginseer();
    }

}

class benchi extends CarAnalogy
{
    @Override
    public void startEngineer() {
        System.out.println("benchi");
     }
}

class aodi extends CarAnalogy
{
    @Override
    public void startEngineer() {
        System.out.println("aodi");
    }
}

class qq extends CarAnalogy
{
    @Override
    public void startEngineer() {
        System.out.println("qq");
    }
}

