import java.io.File;
import java.io.IOException;
import java.util.Formatter;

/*Receiver class*/
public class Game {

    static void startGame() {
        System.out.println("Игра началась");
    }

    static void loadGame() {
        System.out.println("Игра загружена");
    }

    static void saveGame() {
        System.out.println("Игра сохранена");
    }

    static void exitGame() {
        System.out.println("Выход из игры");
        System.exit(0);
    }
}

