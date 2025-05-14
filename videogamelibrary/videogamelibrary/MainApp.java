package videogamelibrary;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        GameController controller = new GameController();
        controller.showMainView(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
