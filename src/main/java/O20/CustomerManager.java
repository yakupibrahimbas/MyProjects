package O20;

public class CustomerManager {
   private ICustomerDal customerDal;
    public CustomerManager(){
        this.customerDal=customerDal;
    }
    public void add(){
        customerDal.Add();
    }
}
