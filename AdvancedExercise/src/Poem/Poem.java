package Poem;

public class Poem {
    private String name;
    private int numberOfLines;

    // Constructor that requires both fields
    public Poem(String poemName, int lines) {
        name = poemName;
        numberOfLines = lines;
    }

    // Get method for poem name
    public String getName() {
        return name;
    }

    // Get method for number of lines
    public int getNumberOfLines() {
        return numberOfLines;
    }
}
