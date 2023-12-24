package A24;

public class Animal {

    //child classda override edilen methodun return type ile parent classtaki methodun
    //methodun return typei void ise Overriding yaparken type degistirilemez

    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");

    }
    public Animal create(){
        return new Animal();
    }
    public int add(int a,int b){
        return a+b;
    }
public Integer multiply(int a,int b){
        return a*b;
}

}
