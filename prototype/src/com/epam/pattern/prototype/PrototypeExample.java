package com.epam.pattern.prototype;

import com.epam.pattern.prototype.cookie.ChocolateCookie;
import com.epam.pattern.prototype.cookie.Cookie;
import com.epam.pattern.prototype.cookie.CookieMachine;

public class PrototypeExample
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        final ChocolateCookie originalCookie = new ChocolateCookie();
        originalCookie.setName("Chocolate cookie");
        originalCookie.setChocolate("Milk chocolate");

        System.out.println(originalCookie);

        final CookieMachine cookieMachine = new CookieMachine(originalCookie);
        final Cookie copiedCookie = cookieMachine.makeCookie();

        System.out.println(copiedCookie);

        final ChocolateCookie constructedCookie = new ChocolateCookie(originalCookie);

        System.out.println(constructedCookie);
    }
}
