package com.eoi;

public class Monitor {
    private String model;
    private int size;
    private Resolution resolution;

    public Monitor(String model, int size, Resolution resolution) {
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
