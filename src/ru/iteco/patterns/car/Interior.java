package ru.iteco.patterns.car;

public abstract class Interior {
    public abstract String getName();

    public abstract String getColor();

    public abstract String getMaterial();

    @Override
    public String toString() {
        return "Interior <<Name - " + getName() + " Color - " + getColor() + " Material - " + getMaterial() + ">> ";
    }
}
