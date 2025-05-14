package videogamelibrary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class GameController {
    public void showMainView(Stage stage) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Game Library");
        alert.setHeaderText(null);
        alert.setContentText("Game Library GUI will be implemented here.");
        alert.showAndWait();
    }
    public void saveData(UserProfile profile, String filename) {
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
        out.writeObject(profile);
    } catch (IOException e) {
        e.printStackTrace();
    }
    
}

}
