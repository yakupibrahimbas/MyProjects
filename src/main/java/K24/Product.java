package K24;

public class Product {
    private String id;
    public String brand;
    public String model;
    public int stockAmount;
    public String color;

    public Product(String brand, String model, int stockAmount, String color) {
        this.brand = brand;
        this.model = model;
        this.stockAmount = stockAmount;
        this.color = color;
    }

}
