package com.epam.pattern.facade.computer;

import com.epam.pattern.facade.computer.elements.HardDrive;
import com.epam.pattern.facade.computer.elements.Memory;
import com.epam.pattern.facade.computer.elements.Processor;

public class HomeComputerFacade implements ComputerFacade {

    private static final int BOOT_ADDRESS = 0x00002000;
    private static final int BOOT_SECTOR = 0x10008000;
    private static final int SECTOR_SIZE = 0x4000;

    private final Processor processor;
    private final Memory memory;
    private final HardDrive hardDrive;

    public HomeComputerFacade() {
        this.processor = new Processor();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    @Override
    public void start() {
        processor.freeze();
        memory.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
