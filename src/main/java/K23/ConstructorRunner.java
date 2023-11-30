package K23;

public class ConstructorRunner {
    public static void main(String[] args) {

        Constructor constructor=new Constructor();
        System.out.println(constructor.name+constructor.model+constructor.price+ constructor.stockAmount);
        Constructor constructor1=new Constructor("Lenovo","ideapad",5000,300);
        System.out.println(constructor1.name+" "+constructor1.model+" "+constructor1.price+" "+constructor1.stockAmount);

    }
}
