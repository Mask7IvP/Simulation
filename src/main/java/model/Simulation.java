package model;

import view.ConsoleMapRenderer;

public class Simulation {

    ConsoleMapRenderer consoleMapRenderer = new ConsoleMapRenderer();
    Actions actions = new Actions();
    private int moveCounter = 0;

    public void startSimulation() {
        //запустить бесконечный цикл симуляции и рендеринга
        nextTurn();
    }

    private void nextTurn() {
        if (moveCounter == 0) {
            actions.initActions();
        } else {
            actions.turnActions();
        }
        consoleMapRenderer.render(actions.playingMap);
    }

    void pauseSimulation() {
        //приостановить бесконечный цикл симуляции
    }

}
