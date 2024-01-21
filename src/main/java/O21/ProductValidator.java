package O21;

public class ProductValidator {
    public boolean isValid(Product product){
        if (product.price>0&&!product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
//create read update delete (crud)
