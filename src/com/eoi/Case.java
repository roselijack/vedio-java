package com.eoi;



public class Case {

    private String model;
    private Dimension dimension;

    public Case(String model, Dimension dimension) {
        this.model = model;
        this.dimension = dimension;
    }

    public String getModel() {
        return model;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
