package ru.iteco.patterns.car.Lada;

import ru.iteco.patterns.car.Interior;

public class SimpleInterior extends Interior {
    @Override
    public String getName() {
        return "Simple interior";
    }

    @Override
    public String getColor() {
        return "Grey";
    }

    @Override
    public String getMaterial() {
        return "Cloth";
    }
}
