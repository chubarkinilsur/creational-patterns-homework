package ru.iteco.patterns.car;

public interface CarFactory {
    Body createBody();

    Interior createInterior();

    Engine createEngine();
}
