package com.epam.pattern.proxy;

import com.epam.pattern.proxy.image.Image;
import com.epam.pattern.proxy.image.impl.ProxyImage;

public class ProxyExample {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("C://images/file1.jpg");
        Image image2 = new ProxyImage("C://images/file2.jpg");

        image1.display();
        image2.display();
        image1.display();
        image2.display();
        image1.display();
    }
}
