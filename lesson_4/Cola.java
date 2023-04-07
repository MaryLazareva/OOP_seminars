package lesson_4;

public class Cola extends Product {

    private int weight;
    
    public Cola(int weight) {
        this.weight = weight;
        
    }
    @Override
    public String toString() {
        
        return String.format("Weight %d", weight);

    }
}
