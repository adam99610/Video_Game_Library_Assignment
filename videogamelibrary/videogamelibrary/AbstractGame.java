package videogamelibrary;

import java.io.Serializable;

public abstract class AbstractGame implements Playable, Serializable {
    private String title;
    private String genre;
    private String platform;
    private int releaseYear;
    private String developer;

    public AbstractGame(String title, String genre, String platform, int releaseYear, String developer) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.releaseYear = releaseYear;
        this.developer = developer;
    }

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public int getReleaseYear() { return releaseYear; }
    public void setReleaseYear(int releaseYear) { this.releaseYear = releaseYear; }

    public String getDeveloper() { return developer; }
    public void setDeveloper(String developer) { this.developer = developer; }

    @Override
    public abstract void updateProgress();
}
