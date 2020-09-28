package ru.iteco.patterns.car.BMV;

import ru.iteco.patterns.car.Body;
import ru.iteco.patterns.car.CarFactory;
import ru.iteco.patterns.car.Engine;
import ru.iteco.patterns.car.Interior;

public class BMVCarFactory implements CarFactory {

    @Override
    public Body createBody() {
        return new HatchbackBody();
    }

    @Override
    public Interior createInterior() {
        return new ExpensiveInterior();
    }

    @Override
    public Engine createEngine() {
        return new DieselEngine();
    }
}
