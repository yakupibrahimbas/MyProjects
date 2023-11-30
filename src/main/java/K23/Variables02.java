package K23;


import com.sun.tools.javac.Main;

public class Variables02 {
    public  int sayi1=6;

    public static void main(String[] args) {

        int sayi=5;
        sayi=7;
        System.out.println(sayi);
       // sayi1=4;
       // System.out.println(sayi1);
      /*  Main main =new Main();
        main.sayi1;
        System.out.println(); */

        Person person=new Person();
        Person person1=new Person();
        person.firstName="Furkan";
        person1.firstName="Yakup";
        person.lastName="can";
        person1.lastName="canan";
        person.age=23;
        person1.age=35;
        System.out.println(person.firstName+person.lastName+person.age);
        System.out.println(person1.firstName+person1.lastName+person1.age);

        Ford focus=new Ford();
        Ford mondeo=new Ford();
      //  System.out.println(focus.numberOfGears);
      //  System.out.println(mondeo.numberOfGears);

        focus.numberOfGears=8;
        mondeo.numberOfGears=5;
        System.out.println(focus.numberOfGears);
        System.out.println(mondeo.numberOfGears);
        Ford.numberOfGears=12;
        System.out.println(Ford.numberOfGears);


    }
}
