package com.eoi;

public class House {
    private int number;
    private Room room;

    public House(int number, Room room) {
        this.number = number;
        this.room = room;
    }

    public int getNumber() {
        return number;
    }

    public Room getRoom() {
        return room;
    }

    public int addNumber(int add)
    {
        return add+number;
    }
}
