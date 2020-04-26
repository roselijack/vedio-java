package com.eoi;

public class PC {
    private Case thiscase;
    private Monitor thismoditor;
    private MotherBoad motherBoad;

    public PC(Case thiscase, Monitor thismoditor, MotherBoad motherBoad) {
        this.thiscase = thiscase;
        this.thismoditor = thismoditor;
        this.motherBoad = motherBoad;
    }

    public Case getThiscase() {
        return thiscase;
    }

    public Monitor getThismoditor() {
        return thismoditor;
    }

    public MotherBoad getMotherBoad() {
        return motherBoad;
    }
}
