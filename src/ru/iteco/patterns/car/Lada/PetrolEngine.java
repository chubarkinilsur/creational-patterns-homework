package ru.iteco.patterns.car.Lada;

import ru.iteco.patterns.car.Engine;

public class PetrolEngine extends Engine {
    @Override
    public String getType() {
        return "Petrol";
    }

    @Override
    public String getPower() {
        return "75 hp";
    }
}
