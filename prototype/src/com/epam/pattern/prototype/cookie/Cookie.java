package com.epam.pattern.prototype.cookie;

public class Cookie implements Cloneable // It's a Prototype
{
    private String name;

    public Cookie()
    {
    }

    public Cookie(final Cookie cookie)
    {
        this.name = cookie.getName();
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString()
    {
        return super.toString() + ", Name is: " + name;
    }
}
