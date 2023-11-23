package lab02.AimsProject;

public class DigitalVideoDisc {
    // Attribute
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    private static int nbDigitalVideoDiscs = 0;

    // Constructor
    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category,String director, double cost) {
        this(title);
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this(title, category, director, cost);
        this.length = length;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }
}
