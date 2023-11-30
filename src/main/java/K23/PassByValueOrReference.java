package K23;

import java.util.Arrays;

public class PassByValueOrReference {
    public static void main(String[] args) {

        int number=5;
        System.out.println("Previous value of Number: "+ number);
        changeToValue(number);
        System.out.println("current value of number:"+number);
        PassByReference reference=new PassByReference();
        reference.number2=7;
        System.out.println("Previous value of number2 : "+reference.number2);
        reference.change(reference);
        System.out.println("current value of number2: "+reference.number2);
        int []array=new int[]{2,4,6};
        System.out.println("First element of array:"+ array[0]);
        ArrayAsAReference arrayAsAReference=new ArrayAsAReference();
        arrayAsAReference.changeToArray(array);
        System.out.println("current value of element:"+array[0]);



    }
public static void changeToValue(int number){
        number=number+5;

  }

}
