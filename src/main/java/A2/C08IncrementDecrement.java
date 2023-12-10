package A2;

public class C08IncrementDecrement {
    public static void main(String[] args) {

        //Increment means to increase value of a variable

        int age=13;

        //1.Way:
        age=age+2;
        System.out.println(age);

        //2.Way:
        age+=2;
        System.out.println(age);

        age=age-2;
        System.out.println(age);
        age-=5;
        System.out.println(age);

        age=age*2;
        System.out.println(age);
        age*=2;
        System.out.println(age );
        //syntax used just to increase by 1
        age++;
        System.out.println(age);

        //Decrement means to decrease vaue of a variable
        age=age-3;
        System.out.println(age);
        age-=10;
        System.out.println(age);

        //Decrement can be done by division as well
        age=age/5;
        System.out.println(age);
        age/=10;
        System.out.println(age);

        //Syntax used just to decrease by 1
        age--;
        System.out.println(age);



    }
}
