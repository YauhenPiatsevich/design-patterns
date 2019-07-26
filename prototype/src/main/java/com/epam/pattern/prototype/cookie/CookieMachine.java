package com.epam.pattern.prototype.cookie;

public class CookieMachine {

    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) cookie.clone();
    }
}
