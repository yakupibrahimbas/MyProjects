package A25;

public interface Ac {

    //bir interfacei bir classin parenti yapmak icin implements keywordu kullanilir
    //interfacelerin icine cocrete method konulamaz
    //interfacelerdeki tum methodlar publictir
    //interfaceler concrete method icermezler
    //interfacelerdeki tum variableler otomatik olarak publictir.
    //static keywordunu kullanarak interface icine concrete method koyabiliriz
    //interview sorusu : abstract class ile interface arasindaki fark nelerdir
    //abstract classlar hem abstract hemde concrete methodlar icerebilir


    public abstract void cool();
    void run();
   int price=2000;
   default void eco(){
       System.out.println("Uses gas less");
   }



}
