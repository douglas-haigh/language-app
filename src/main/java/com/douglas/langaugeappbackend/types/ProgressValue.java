package com.douglas.langaugeappbackend.types;

public enum ProgressValue {
    NEW("NEW"),
    LEARNING("LEARNING"),
    MASTERED("MASTERED");

    public String progressValue;
    ProgressValue(String progressValue) {this.progressValue = progressValue;}
}
