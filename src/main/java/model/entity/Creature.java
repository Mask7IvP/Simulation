package model.entity;

import model.Coordinates;
import model.PlayingMap;

public abstract class Creature extends Entity {
    int speed;
    int health;
    public abstract void makeMove(Coordinates coordinates, PlayingMap playingMap);


}
