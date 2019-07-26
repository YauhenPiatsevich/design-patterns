package com.epam.pattern.prototype;

import com.epam.pattern.prototype.cookie.ChocolateCookie;
import com.epam.pattern.prototype.cookie.Cookie;
import com.epam.pattern.prototype.cookie.CookieMachine;

public class PrototypeExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        ChocolateCookie originalCookie = new ChocolateCookie();
        originalCookie.setName("Chocolate cookie");
        originalCookie.setChocolate("Milk chocolate");

        System.out.println(originalCookie);

        CookieMachine cookieMachine = new CookieMachine(originalCookie);
        Cookie copiedCookie = cookieMachine.makeCookie();

        System.out.println(copiedCookie);

        ChocolateCookie constructedCookie = new ChocolateCookie(originalCookie);

        System.out.println(constructedCookie);
    }
}
