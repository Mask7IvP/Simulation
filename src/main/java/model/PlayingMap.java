package model;

import model.entity.Entity;

import java.util.HashMap;
import java.util.Map;

public class PlayingMap {
    private final int MIN_ROW = 4;
    private final int MAX_ROW = 5;
    private final int MIN_COLUMN = 4;
    private final int MAX_COLUMN = 5;
    Map<Coordinates, Entity> entities = new HashMap<>();

    public void setEntity(Coordinates coordinates, Entity entity) {
        entity.coordinates = coordinates;
        entities.put(coordinates, entity);
    }

    public int getMaxRow() {
        return MAX_ROW;
    }

    public int getMaxColumn() {
        return MAX_COLUMN;
    }

    public Map<Coordinates, Entity> getEntities() {
        return entities;
    }
//    public boolean isValid(int row, int column) {
//        if (row > 0 && column )
//        return true;
//    }

}
