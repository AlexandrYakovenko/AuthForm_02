package model.entity;

public enum Group {
    FIRST("first"),
    SECOND("second"),
    THIRD("third");

    private String name;

    Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
