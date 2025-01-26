package model.entity;

import model.Coordinates;

public abstract class Creature extends Entity {
    int speed;
    int health;
    public abstract void makeMove(Coordinates coordinates);


}
