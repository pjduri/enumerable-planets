package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88, "Terrestrial"),
    VENUS("Venus", 225, "Terrestrial"),
    EARTH("Earth", 365, "Terrestrial"),
    MARS("Mars", 687, "Terrestrial"),
    JUPITER("Jupiter", 4333, "Gas Giant"),
    SATURN("Saturn", 10759, "Gas Giant"),
    URANUS("Uranus", 30687, "Ice Giant"),
    NEPTUNE("Neptune", 60200, "Ice Giant");

    private String name;
    private int yearLength;
    private String type;

    Planets(String name, int yearLength, String type) {
        this.name = name;
        this.yearLength = yearLength;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getType() {
        return type;
    }

}
