package com.epam.pattern.facade.computer.elements;

public class Memory {

    public void load(int address, int[] read) {
        System.out.println(String.format("Memory loaded raw data with length 0x%04x from 0x%08x",
                read.length, address));
    }
}
