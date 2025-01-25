package model.entity;

import model.Coordinates;

public class Predator extends Creature {
    public Predator(Coordinates coordinates) {
        super(coordinates);
        speed = 3;
        health = 12;
    }

    private final int attackPower = 5;

    @Override
    void makeMove() {
//сделать ход или атаковать (съесть) травоядного.
// При этом количество HP травоядного уменьшается на силу атаки хищника.
// Если значение HP жертвы опускается до 0, травоядное исчезает

    }
}