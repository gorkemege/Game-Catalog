import java.util.List;
import java.util.ArrayList;

public class Game {
    private String title;
    private List<String> genre;
    private String developer;
    private String publisher;
    private List<String> platforms;
    private List<String> translators;
    private int steamId;
    private int releaseYear;
    private double playtime;
    private String format;
    private String language;
    private double rating;
    private List<String> tags;
    private String coverImagePath;


    public Game() {
        // VarsayÄ±lan constructor
    }

    // Getters ve Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getGenre() {
        return genre;
    }
    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }
    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<String> getPlatforms() {
        return platforms;
    }
    public void setPlatforms(List<String> platforms) {
        this.platforms = platforms;
    }

    public List<String> getTranslators() {
        return translators;
    }
    public void setTranslators(List<String> translators) {
        this.translators = translators;
    }

    public int getSteamId() {
        return steamId;
    }
    public void setSteamId(int steamId) {
        this.steamId = steamId;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getPlaytime() {
        return playtime;
    }
    public void setPlaytime(double playtime) {
        this.playtime = playtime;
    }

    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getCoverImagePath() {
        return coverImagePath;
    }
    public void setCoverImagePath(String coverImagePath) {
        this.coverImagePath = coverImagePath;
    }

}