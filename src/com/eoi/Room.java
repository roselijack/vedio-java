package com.eoi;

public class Room {
    private int width;
    private int highet;
    private int depth;

    public Room(int width, int highet, int depth) {
        this.width = width;
        this.highet = highet;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHighet() {
        return highet;
    }

    public int getDepth() {
        return depth;
    }

    public int volumn()
    {
        return width*highet*depth;
    }


}
