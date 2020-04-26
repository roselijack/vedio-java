package com.eoi;

public class MotherBoad {
    private String size;

    public MotherBoad(String size) {
        this.size = size;
    }

    private String getSize() {
        return size;
    }

    public String expand()
    {
        return getSize()+"l";
    }
}
