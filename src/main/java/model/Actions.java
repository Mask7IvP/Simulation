package model;

import model.entity.*;

import java.util.Map;

public class Actions {

    PlayingMap playingMap = new PlayingMap();

    public void initActions() {
        playingMap.setEntity(new Coordinates(0, 0), new Rock(new Coordinates(0, 0)));
//        playingMap.setEntity(new Coordinates(2, 4), new Rock(new Coordinates(2, 4)));

        playingMap.setEntity(new Coordinates(1, 1), new Tree(new Coordinates(1, 1)));
//        playingMap.setEntity(new Coordinates(4, 4), new Tree(new Coordinates(4, 4)));

        playingMap.setEntity(new Coordinates(4, 2), new Grass(new Coordinates(4, 2)));
//        playingMap.setEntity(new Coordinates(0, 3), new Grass(new Coordinates(0, 3)));

        playingMap.setEntity(new Coordinates(4, 1), new Herbivore(new Coordinates(4, 1)));
//        playingMap.setEntity(new Coordinates(3, 2), new Herbivore(new Coordinates(3, 2)));

        playingMap.setEntity(new Coordinates(2, 2), new Predator(new Coordinates(2, 2)));
//        playingMap.setEntity(new Coordinates(1, 3), new Predator(new Coordinates(1, 3)));


    }

    public void turnActions() {
//        for (Coordinates coordinates : playingMap.getEntities().keySet()) {
//            Entity entity = playingMap.getEntities().get(coordinates);
//            entity.
//        }
    }
}

//действие, совершаемое над всем миром.
// Например сходить всеми существами. Это действие итерировало бы
//существ и вызывало к каждому makeMove() Каждое действие
// описывается отдельным классом и совершает операции над картой
//Симуляция содержит два массива действий:
//initActions - действия, совершаемые перед стартом симуляции;
//turnActions - действия, совершаемые каждый ход (передвижение существ,
// добавить травы и травоядных, если они заканчиваются)
