package com.eoi;

public class Car {
    private String door;
    private String wheels;
    private String model;
    public void setModel(String model)
    {
        String validModle = model.toLowerCase();
        if(validModle.equals("porshe") || validModle.equals("holden"))
        {
            this.model=model;
        }
        else
        {
            this.model="unknown";
        }

    }
    public String getMode()
    {
        return this.model;
    }

}
