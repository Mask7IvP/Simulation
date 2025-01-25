package model.entity;

import model.Coordinates;

public abstract class Creature extends Entity {
    int speed;
    int health;
    abstract void makeMove();

    public Creature(Coordinates coordinates) {
        super(coordinates);

    }
}
