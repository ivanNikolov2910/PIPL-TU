package lectures.test_example_3;

import java.io.Serializable;

public class Regex implements Serializable {
    private static int nextId = 0;
    private int id;
    private String pattern;
    private String description;
    private int rating;

    public Regex(String pattern, String description) {
        this.pattern = pattern;
        this.description = description;
        this.rating = 0;
        this.id = ++nextId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
