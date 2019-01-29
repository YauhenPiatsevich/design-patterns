package com.epam.pattern.templatemethod.computer;

public class Computer
{
    private String processor;
    private String memory;
    private String graphicsAdapter;

    public void setProcessor(final String processor)
    {
        this.processor = processor;
    }

    public void setMemory(final String memory)
    {
        this.memory = memory;
    }

    public void setGraphicsAdapter(final String graphicsAdapter)
    {
        this.graphicsAdapter = graphicsAdapter;
    }

    @Override
    public String toString()
    {
        return String.format("Processor: %s, Memory: %s, Graphics Adapter: %s",
                processor, memory, graphicsAdapter);
    }
}
