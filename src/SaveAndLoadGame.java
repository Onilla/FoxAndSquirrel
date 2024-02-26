import java.io.*;
import java.nio.charset.StandardCharsets;

public class SaveAndLoadGame {
    String path;

    public SaveAndLoadGame(String path) {
        this.path = path;
    }

    public boolean saveInFile(String currentParagraph) {
        try (FileWriter writer = new FileWriter(this.path, false)) {
            writer.write(currentParagraph);
            writer.flush();
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public String loadFromFile() {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(this.path), StandardCharsets.UTF_8))) {
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            return null;
        }
    }
}
