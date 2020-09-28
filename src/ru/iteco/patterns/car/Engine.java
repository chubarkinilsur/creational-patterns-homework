package ru.iteco.patterns.car;

public abstract class Engine {
    public abstract String getType();

    public abstract String getPower();

    @Override
    public String toString() {
        return "Engine <<Type - " + getType() + " Power - " + getPower()+">> ";
    }
}
