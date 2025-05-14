package videogamelibrary;

import java.io.*;
import java.util.ArrayList;

public class DataHandler {
    public static void saveLibrary(GameLibrary library, String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GameLibrary loadLibrary(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            return (GameLibrary) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new GameLibrary();
        }
    }
}
