package ru.iteco.patterns.car;

public abstract class Body {
    public abstract String getColor();

    public abstract String getType();

    public abstract String getName();

    @Override
    public String toString() {
        return "Body <<Name - " + getName() + " Color - " + getColor() + " Type - " + getType() + ">> ";
    }
}
