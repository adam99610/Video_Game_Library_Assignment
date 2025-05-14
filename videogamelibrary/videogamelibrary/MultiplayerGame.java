package videogamelibrary;

public class MultiplayerGame extends AbstractGame {
    private int wins;
    private int losses;

    public MultiplayerGame(String title, String genre, String platform, int releaseYear, String developer) {
        super(title, genre, platform, releaseYear, developer);
        this.wins = 0;
        this.losses = 0;
    }

    public int getWins() { return wins; }

    public int getLosses() { return losses; }

    public void addWin() { wins++; }

    public void addLoss() { losses++; }

    @Override
    public void updateProgress() {
        wins++;
    }
}
