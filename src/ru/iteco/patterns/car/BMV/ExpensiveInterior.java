package ru.iteco.patterns.car.BMV;

import ru.iteco.patterns.car.Interior;

public class ExpensiveInterior extends Interior {
    @Override
    public String getName() {
        return "Expensive";
    }

    @Override
    public String getColor() {
        return "Gold";
    }

    @Override
    public String getMaterial() {
        return "Leather";
    }
}
