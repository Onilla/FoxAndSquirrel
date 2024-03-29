import java.util.Scanner;

public class GameScript {

    private static final Scanner scanner = new Scanner(System.in);
    private static String currentParagraph;

    public static void goOnParagraph(Paragraph paragraph) {
        Status gameStatus = Status.IN_PROGRESS;

        currentParagraph = paragraph.name();

        int playerInput;

        if (paragraph.getStatus() != null) {
            gameStatus = paragraph.getStatus();
        }

        while (gameStatus.equals(Status.IN_PROGRESS)) {
            System.out.println(paragraph.getText());
            System.out.println(paragraph.getChoice());
            System.out.println("""
                                        
                    Выберите вариант 1 или 2!
                    Введите 3, чтобы выйти в меню.
                    """);
            playerInput = scanner.nextInt();
            if (playerInput == 1) {
                goOnParagraph(paragraph.getFirstVar());
            } else if (playerInput == 2) {
                goOnParagraph(paragraph.getSecondVar());
            } else if (playerInput == 3) {
                Menu.shortMenu();
                Menu.mainMenu();
            } else {
                System.out.println("""
                        Выберите вариант 1 или 2!
                        Введите 3, чтобы выйти в меню.
                        """);
            }

        }
        System.out.println(gameStatus.getMessage());
        Menu.mainMenu();

    }

    public static String getCurrentParagraph() {
        return currentParagraph;
    }

}