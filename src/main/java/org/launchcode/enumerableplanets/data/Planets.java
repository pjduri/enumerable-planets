package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury"),
    VENUS("Vanus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");

    private String displayName;

    Planets(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}
