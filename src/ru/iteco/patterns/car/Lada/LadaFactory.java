package ru.iteco.patterns.car.Lada;

import ru.iteco.patterns.car.Body;
import ru.iteco.patterns.car.CarFactory;
import ru.iteco.patterns.car.Engine;
import ru.iteco.patterns.car.Interior;

public class LadaFactory implements CarFactory {


    @Override
    public Body createBody() {
        return new SedanBody();
    }

    @Override
    public Interior createInterior() {
        return new SimpleInterior();
    }

    @Override
    public Engine createEngine() {
        return new PetrolEngine();
    }
}
