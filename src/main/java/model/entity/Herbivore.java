package model.entity;

import model.Coordinates;
import model.PlayingMap;

import java.util.Iterator;
import java.util.Map;

public class Herbivore extends Creature {
    public Herbivore() {
        speed = 2;
        health = 10;
    }

    //        ПОИСК в ШИРИНУ:
    @Override
    public void makeMove(Coordinates coordinates, PlayingMap playingMap) {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int newRow = coordinates.getRow() + i;
                int newColumn = coordinates.getColumn() + j;
                if (isCoordinatesInsideMapBounds(playingMap, newRow, newColumn)) {
                    Coordinates coordinatesNew = new Coordinates(newRow, newColumn);
                    Iterator<Map.Entry<Coordinates, Entity>> iterator = playingMap.getEntities().entrySet().iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<Coordinates, Entity> entry = iterator.next();
                        if (entry.getKey().equals(coordinates)) {
                            iterator.remove();
                        }
                    }
//                    if (playingMap.getEntities().containsKey(coordinatesNew)) {
//                        if (isFood(playingMap, coordinatesNew)) {
//                            //ешь, -запиши координаты grass в список с травой
//                            playingMap.setEntity(coordinatesNew, playingMap.getEntities().get(coordinates));
//                            Iterator<Map.Entry<Coordinates, Entity>> iterator = playingMap.getEntities().entrySet().iterator();
//                            while (iterator.hasNext()) {
//                                Map.Entry<Coordinates, Entity> entry = iterator.next();
//                                // Условие для удаления элемента
//                                if (entry.getKey().equals(coordinates)) {
//                                    iterator.remove();
//                                }
//                            }
//                        } else if (isDanger(playingMap, coordinatesNew)) {
//                            //беги, -запиши координаты в список хищников
//                        }
//                    } else {
//                        // запиши координаты в с список с пустыми клетками
//                    }
                }
            }
        }
    }

    private static boolean isCoordinatesInsideMapBounds(PlayingMap playingMap, int newRow, int newColumn) {
        return (newRow >= 0 && newRow < playingMap.getMaxRow()) && (newColumn >= 0 && newColumn < playingMap.getMaxColumn());
    }

    private static boolean isFood(PlayingMap playingMap, Coordinates coordinatesNew) {
        return playingMap.getEntities().get(coordinatesNew) instanceof Grass;
    }

    private static boolean isDanger(PlayingMap playingMap, Coordinates coordinatesNew) {
        return playingMap.getEntities().get(coordinatesNew) instanceof Predator;
    }
}

//сделать ход или съесть траву,