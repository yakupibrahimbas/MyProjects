package K19;

public class K01_PassByValue {
    public static void main(String[] args) {

        int number=5;
        System.out.println("previous value of number:"+number);
        changeTheValue(number);
        System.out.println("currrent value of number = " + number);
        K02_PassByReference reference=new K02_PassByReference();
        reference.number2=7;
        System.out.println("Previous value of number2:"+reference.number2);
        reference.change(reference);
        System.out.println("current value of number2:"+reference.number2);

    }
    public static void changeTheValue(int number){
        number=number+5;
    }

}
