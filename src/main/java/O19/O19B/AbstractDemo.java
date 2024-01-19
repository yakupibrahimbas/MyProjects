package O19.O19B;

public class AbstractDemo {
    public static void main(String[] args) {
CustomerManager customerManager=new CustomerManager();
customerManager.databaseManager=new OracleDatabaseManager();

customerManager.getCustomers();

    }
}
