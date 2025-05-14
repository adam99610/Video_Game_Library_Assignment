package videogamelibrary;

public class SinglePlayerGame extends AbstractGame {
    private int levelsCompleted;
    private int totalLevels;

    public SinglePlayerGame(String title, String genre, String platform, int releaseYear, String developer, int totalLevels) {
        super(title, genre, platform, releaseYear, developer);
        this.totalLevels = totalLevels;
        this.levelsCompleted = 0;
    }

    public int getLevelsCompleted() { return levelsCompleted; }

    public void setLevelsCompleted(int levelsCompleted) { this.levelsCompleted = levelsCompleted; }

    public int getTotalLevels() { return totalLevels; }

    @Override
    public void updateProgress() {
        if (levelsCompleted < totalLevels) {
            levelsCompleted++;
        }
    }
}
