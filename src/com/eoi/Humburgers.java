package com.eoi;

public class Humburgers {
    private String breadRollType;
    private boolean meat;
    private int price;
    private String additional1;
    private String additional2;
    private String additional3;
    private String additional4;
    private String name;

    public Humburgers(String breadRollType, boolean meat, int price, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public int itermlizeHumburger()
    {
        if(this.additional1!=null )
        {
            this.price = this.price+1;
        }
        if(this.additional2!=null )
        {
            this.price = this.price+2;
        }
        if(this.additional3!=null )
        {
            this.price = this.price+3;
        }
        if(this.additional4!=null )
        {
            this.price = this.price+4;
        }
        return this.price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAdditional1() {
        return additional1;
    }

    public void setAdditional1(String additional1) {
        this.additional1 = additional1;
    }

    public String getAdditional2() {
        return additional2;
    }

    public void setAdditional2(String additional2) {
        this.additional2 = additional2;
    }

    public String getAdditional3() {
        return additional3;
    }

    public void setAdditional3(String additional3) {
        this.additional3 = additional3;
    }

    public String getAdditional4() {
        return additional4;
    }

    public void setAdditional4(String additional4) {
        this.additional4 = additional4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
