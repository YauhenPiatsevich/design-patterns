package com.epam.pattern.prototype.cookie;

public class ChocolateCookie extends Cookie {

    private String chocolate;

    public ChocolateCookie() {
        super();
    }

    public ChocolateCookie(ChocolateCookie cookie) {
        super(cookie);
        this.chocolate = cookie.getChocolate();
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chocolate type is: " + chocolate;
    }
}
