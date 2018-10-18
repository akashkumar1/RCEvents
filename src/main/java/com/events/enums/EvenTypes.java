package com.events.enums;

public enum EvenTypes {
    WEDDING("wedding", "Wedding Occasion"),
    BIRTHDAY("birthday", "BirthDays");

    private String key, description;

    EvenTypes(String key, String description){
        this.key=key;
        this.description=description;
    }

    public String getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }
}
