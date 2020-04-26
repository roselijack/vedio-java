package com.eoi;

public class Printer {
    private int toner_level;
    private int pages;
    private boolean duplex;

    public Printer(int toner_level, int pages, boolean duplex) {
        this.toner_level = toner_level;
        this.pages = pages;
        this.duplex = duplex;
    }

    public int getToner_level() {
        return toner_level;
    }

    public void setToner_level(int toner_level) {
        if(toner_level<100)
        {
            this.toner_level = toner_level;
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void increasePages(int add) {
        this.pages = add+this.pages;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }


}
