package O16;

public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.name="Laptop";
        product.price=5000;
        product.stockAmount=3;
        System.out.println(product.name);
        ProductManager productManager=new ProductManager();
        productManager.Add(product);

    }
}
