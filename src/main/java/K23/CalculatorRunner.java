package K23;

public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        calculator.add(3,5);
        calculator.add(3,23,46);
        System.out.println(calculator.add(20,30,40));


    }
}
