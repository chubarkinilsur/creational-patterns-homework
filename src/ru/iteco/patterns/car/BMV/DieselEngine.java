package ru.iteco.patterns.car.BMV;

import ru.iteco.patterns.car.Engine;

public class DieselEngine extends Engine {

    @Override
    public String getType() {
        return "Diesel";
    }

    @Override
    public String getPower() {
        return "100 hp";
    }
}
