package A20;

public class Student {

    //publc >protected>default>private
    //public her classtan kullanilabilir
    //protected baska packagelerden kullanamzlar ancak baska packagelerde child class icinde kullanilabilir
    //deafult baska packagelerden kullanilamazlar
    //private ==sadece olusturulduklari clas icinde kullanilabilir


    public String stdName="Ali Can";
    protected String address="Istanbul";
    String email="alican@gmail.com";//default access modifierleerda defaut keyword yazilmaz

    private String ssnId="123456789";

}
