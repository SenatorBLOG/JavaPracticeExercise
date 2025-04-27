package Rock;

public class Rock {
    private int sampleNumber;
    private String description;
    private double weight;  // in grams

    // Constructor that accepts sample number and weight
    public Rock(int sampleNumber, double weight) {
        this.sampleNumber = sampleNumber;
        this.weight = weight;
        this.description = "Unclassified";  // Default description
    }

    // Getter methods for all fields
    public int getSampleNumber() {
        return sampleNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    // Setter method for description (useful for subclasses)
    protected void setDescription(String description) {
        this.description = description;
    }
}