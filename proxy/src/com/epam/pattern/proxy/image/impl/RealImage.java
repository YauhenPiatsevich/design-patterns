package com.epam.pattern.proxy.image.impl;

import com.epam.pattern.proxy.image.Image;

public class RealImage implements Image
{
    private String fileName;

    public RealImage(final String fileName)
    {
        this.fileName = fileName;
        System.out.println("Loading image " + fileName + " from disk...");
    }

    @Override
    public void display()
    {
        System.out.println("Displaying image " + fileName);
    }
}
