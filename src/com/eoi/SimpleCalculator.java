package com.eoi;

public class SimpleCalculator {
    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // write your code here
    private double firstNumber;
    private double secondNumber;

    public double getAdditionResult()
    {
        return this.firstNumber+this.secondNumber;
    }
    public double getSubtractionResult()
    {
        return this.firstNumber-this.secondNumber;
    }
    public double getMultiplicationResult()
    {
        return this.firstNumber*this.secondNumber;
    }
    public double getDivisionResult()
    {
        if(this.secondNumber !=0)
        {
            return this.firstNumber/this.secondNumber;
        }
        else
        {
            System.out.printf("this secondNumber can't be 0 ");
            return 0.0 ;
        }
    }

}
