package model;

import model.entity.Entity;

import java.util.HashMap;
import java.util.Map;

public class PlayingMap {
    Map<Coordinates, Entity> entities = new HashMap<>();

    public void setEntity(Coordinates coordinates, Entity entity) {
        entity.coordinates = coordinates;
        entities.put(coordinates, entity);
    }

    public Map<Coordinates, Entity> getEntities() {
        return entities;
    }

}
