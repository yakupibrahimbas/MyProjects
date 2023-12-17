package A17;

public class Method02 {
    public static void main(String[] args) {

    add(3,5);



    }
    //Create a method adds two integers
   public static int add(int a,int b){
       return a+b;
    }
    //create a method adds three integers
    public static int add(int a,int b,int c){
       return a+b+c;
    }
//create a method adds one integer and one double
    public static double add(int a,double b){
        return a+b;
    }
    //create a method adds one double and one integer
    public static double add(double a, int b){
        return a+b;
    }
    //note: you can crete many methods with the same name in a class but method parameters must be different
    //note: if you create many methods with the same name in a class it is called method overloading
    //You need to make the parameters different in method overloading
    //To make them diferent you have 3 ways
    //i)change the number of parameters
    //ii) change the data types of the parameters
    //iii)change the places of the parameters, if the data types of parameters are different
    //note:you can use any access modifier in method overloading
    //note:stsatic and non static methods can be overloaded. being static or non static does not affect method overloading
    //note:method names and method parameters are essentials in methods -- ara called method signature
    // if you want to check two methods are wsame or not look at just method names and method parameters
    //java is object oriented programming language(oop language)
    //OOP has 4 principals i)inheritance
                            // ii)polymorphism ==method overloading+ method overriding
                            // iii)encapsulation
                            // iv)abstractions





}
