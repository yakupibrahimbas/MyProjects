package K23;

public class Constructor {

    public String name;
    public String model;
    public int price;
    public int stockAmount;


    public Constructor() {
        this.name = "McBook";
        this.model = "Pro";
        this.price = 15000;
        this.stockAmount = 1000;


    }

    public Constructor(String name, String model, int price, int stockAmount) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.stockAmount = stockAmount;

    }

}
