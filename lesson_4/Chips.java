package lesson_4;

public class Chips {

    private int weight;
    private String taste;

    public Chips(int weight, String taste) {
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String toString() {
        
        return String.format("Weight %d taste %s", weight, taste);
    }
    
}
