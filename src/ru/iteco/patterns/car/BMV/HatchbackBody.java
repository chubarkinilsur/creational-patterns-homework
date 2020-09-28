package ru.iteco.patterns.car.BMV;

import ru.iteco.patterns.car.Body;

public class HatchbackBody extends Body {
    @Override
    public String getColor() {
        return "white";
    }

    @Override
    public  String getType() {
        return "hatchback";
    }

    @Override
    public  String getName() {
        return "hatchback car body type";
    }
}
