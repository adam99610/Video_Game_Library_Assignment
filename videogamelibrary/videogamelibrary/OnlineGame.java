package videogamelibrary;

public class OnlineGame extends AbstractGame {
    private int hoursPlayed;

    public OnlineGame(String title, String genre, String platform, int releaseYear, String developer) {
        super(title, genre, platform, releaseYear, developer);
        this.hoursPlayed = 0;
    }

    public int getHoursPlayed() { return hoursPlayed; }

    public void addPlayTime(int hours) {
        if (hours > 0) {
            hoursPlayed += hours;
        }
    }

    @Override
    public void updateProgress() {
        addPlayTime(1);
    }
}
