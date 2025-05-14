package videogamelibrary;

import java.util.ArrayList;

public class GameLibrary {
    private ArrayList<AbstractGame> games;

    public GameLibrary() {
        games = new ArrayList<>();
    }

    public void addGame(AbstractGame game) {
        games.add(game);
    }

    public ArrayList<AbstractGame> getGames() {
        return games;
    }
}
