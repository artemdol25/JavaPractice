package Task2;

public class Ball {

    private String color;
    private int weight;

    public Ball(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Ball(String color) {
        this.color = color;
    }

    public Ball() {

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Color: " + this.color + "   Weight: " + this.weight + " grams";
    }
}
