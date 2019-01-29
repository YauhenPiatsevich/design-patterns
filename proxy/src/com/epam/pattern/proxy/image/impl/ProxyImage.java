package com.epam.pattern.proxy.image.impl;

import com.epam.pattern.proxy.image.Image;

public class ProxyImage implements Image
{
    private String fileName;
    private RealImage realImage;

    public ProxyImage(final String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void display()
    {
        if (realImage == null)
        {
            realImage = new RealImage(fileName);
        }
        // or any other logic that you can imagine

        realImage.display();
    }
}
