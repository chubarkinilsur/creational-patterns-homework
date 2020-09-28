package ru.iteco.patterns.car;

import ru.iteco.patterns.car.BMV.BMVCarFactory;
import ru.iteco.patterns.car.Lada.LadaFactory;

public class Main {
    public static void main(String[] args) {
        CarFactory bmvFactory = new BMVCarFactory();
        Body bmvBody = bmvFactory.createBody();
        Engine bmvEngine = bmvFactory.createEngine();
        Interior bmvInterior = bmvFactory.createInterior();

        System.out.println("BMV: " + bmvBody + bmvEngine + bmvInterior);

        CarFactory ladaFactory = new LadaFactory();
        Body ladaBody = ladaFactory.createBody();
        Engine ladaEngine = ladaFactory.createEngine();
        Interior ladaInterior = ladaFactory.createInterior();

        System.out.println("Lada: " + ladaBody + ladaEngine + ladaInterior);
    }
}
