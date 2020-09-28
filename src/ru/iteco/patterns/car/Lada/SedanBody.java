package ru.iteco.patterns.car.Lada;

import ru.iteco.patterns.car.Body;

public class SedanBody extends Body {
    @Override
    public String getColor() {
        return "Grey";
    }

    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public String getName() {
        return "Sedan car body type";
    }
}
