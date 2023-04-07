package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine<T> {

    private List<T> products = new ArrayList<>();
    
    public void addProducts(T product) {
        products.add(product);
    }
   
    public List<T> getProducts() {
        return products;
    }

    

}
