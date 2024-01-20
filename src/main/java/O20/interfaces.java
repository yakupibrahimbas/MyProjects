package O20;

public class interfaces {
    public static void main(String[] args) {

            ICustomerDal customerDal=new OracleCustomerDal();
            CustomerManager customerManager=new CustomerManager();


            customerManager.add();
    }
}
