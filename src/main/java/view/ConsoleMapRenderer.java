package view;

import model.*;
import model.entity.*;


public class ConsoleMapRenderer implements View {
    public static final String GRASS_SPRITE = "🌿";
    public static final String HERBIVORE_SPRITE = "🐇";
    public static final String PREDATOR_SPRITE = "🐅";
    public static final String ROCK_SPRITE = "⛰";
    public static final String TREE_SPRITE = "🌳";
    public static final String EMPTY_SPRITE = "🏾";

    @Override
    public void printPlayingMap() {
    }

    public void render(PlayingMap playingMap) {
        for (int row = 0; row <= 4; row++) {
            System.out.println();
            for (int column = 0; column <= 4; column++) {
                Coordinates coordinates = new Coordinates(row, column);
                if (playingMap.getEntities().containsKey(coordinates)) {
                    Entity entity = playingMap.getEntities().get(coordinates);
                    if (entity instanceof Grass) {
                        System.out.print(GRASS_SPRITE);
                    } else if (entity instanceof Herbivore) {
                        System.out.print(HERBIVORE_SPRITE);
                    } else if (entity instanceof Predator) {
                        System.out.print(PREDATOR_SPRITE);
                    } else if (entity instanceof Rock) {
                        System.out.print(ROCK_SPRITE);
                    } else if (entity instanceof Tree) {
                        System.out.print(TREE_SPRITE);
                    }
                } else {
                    System.out.print(EMPTY_SPRITE);
                }
            }
        }
    }
}
//отвечает за визуализацию состояния поля, его отрисовку