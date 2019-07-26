package com.epam.pattern.facade.computer.elements;

public class HardDrive {

    public int[] read(int sector, int size) {
        System.out.println(String.format("Hard drive read 0x%04x raw from 0x%08x", size, sector));
        return new int[size];
    }
}
