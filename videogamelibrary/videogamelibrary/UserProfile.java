package videogamelibrary;

import java.util.ArrayList;

public class UserProfile {
    private String username;
    private String preferredPlatform;
    private ArrayList<AbstractGame> ownedGames;

    public UserProfile(String username, String preferredPlatform) {
        this.username = username;
        this.preferredPlatform = preferredPlatform;
        this.ownedGames = new ArrayList<>();
    }

    public String getUsername() { return username; }

    public String getPreferredPlatform() { return preferredPlatform; }

    public ArrayList<AbstractGame> getOwnedGames() { return ownedGames; }

    public void addGame(AbstractGame game) {
        ownedGames.add(game);
    }
}
