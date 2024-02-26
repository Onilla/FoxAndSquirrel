import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    static SaveAndLoadGame saveGame = new SaveAndLoadGame("C:\\Users\\Ольга\\IdeaProjects\\FoxAndSquirrel\\Параграф.txt");

    public static void mainMenu() {
        System.out.println("Меню:");
        System.out.println("1. Начать игру");
        System.out.println("2. Загрузить игру");
        System.out.println("3. Выйти");
        int playerChoice;
        playerChoice = scanner.nextInt();
        switch (playerChoice) {
            case 1:
                Game.startGame();
                GameScript.goOnParagraph(Paragraph.PARAGRAPH0);
            case 2:
                Game.loadGame();
                GameScript.goOnParagraph(Paragraph.valueOf(saveGame.loadFromFile()));
            case 3:
                Game.exitGame();

            default:
                System.out.println("Некорректный выбор, попробуйте снова.");
        }
    }

    public static void shortMenu() {
        int playerChoice;
        System.out.println("Меню:");
        System.out.println("1. Сохранить игру");
        System.out.println("2. Выйти в главное меню");
        playerChoice = scanner.nextInt();
        if (playerChoice == 1) {
            Game.saveGame();
            saveGame.saveInFile(GameScript.getCurrentParagraph());
        } else if (playerChoice == 2) {
            mainMenu();
        } else {
            System.out.println("""
                    Выберите вариант 1 или 2!
                    Введите 3, чтобы выйти в меню.
                    """);
        }
    }
}
