package O15;

public class Class01 {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


    }

}

