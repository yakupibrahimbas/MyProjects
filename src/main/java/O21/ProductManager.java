package O21;

public class ProductManager {
    public void add(Product product){
        ProductValidator validator=new ProductValidator();
        if (validator.isValid(product)){
            System.out.println("Eklendi");
        }
        System.out.println("Eklendi");
    }
}
