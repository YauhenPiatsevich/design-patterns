package com.epam.pattern.facade.computer.elements;

public class Processor {

    public void freeze() {
        System.out.println("Processor froze");
    }

    public void jump(int address) {
        System.out.println(String.format("Processor jumped to 0x%08x", address));
    }

    public void execute() {
        System.out.println("Processor started execution");
    }
}
