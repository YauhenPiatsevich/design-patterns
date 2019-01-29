package com.epam.pattern.memento;

public class Journal
{
    private String name;
    private Integer mark;

    public void setName(final String name)
    {
        this.name = name;
    }

    public void setMark(final Integer mark)
    {
        this.mark = mark;
    }

    @Override
    public String toString()
    {
        return "Person " + name + " has mark: " + mark;
    }

    // add any logic here that is not part of the state saving in the memento

    public Memento saveState()
    {
        return new Memento(this.name + "&" + this.mark);
    }

    public void restoreState(final Memento memento)
    {
        final String state = memento.getState();
        final String[] split = state.split("&");
        this.name = split[0];
        this.mark = Integer.parseInt(split[1]);
    }

    public class Memento
    {
        private final String state;

        public Memento(final String state)
        {
            this.state = state;
        }

        private String getState()
        {
            return state;
        }
    }
}
