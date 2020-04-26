package com.eoi;

public class Shape {
    private int x;
    private int y;
    public Shape(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape{
    //第一个构造函数调用第二个构造函数，第二个构造函数调用父类构造函数再赋其他值。
    private int width;
    private int height;

    public Rectangle(int x,int y)
    {
        this(x,y,0,0);
    }

    public Rectangle(int x, int y,int width,int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
