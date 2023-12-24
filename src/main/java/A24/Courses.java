package A24;

public abstract class Courses {

    /*
    abstraction
    1-eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece child classlarin yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak abstraction yapariz
    2-bazen parent classtaki methodun bodysi hicbir child class tarafindan kullanilmaz
    3-final methodlar abstract olamazlar
    4-abstract classlarin icinde abstract methodlar olur
    5-abstract classlarin constuvtorlari vardir
    6-abstract classin abstract childi veya concrete childi olabilir .
    7-abstract methodlar private olamazlar
     */


    public abstract void math();
    public void art(){
        System.out.println("Learn art");


    }
//private abstract void sum();

}
