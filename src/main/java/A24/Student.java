package A24;

public class Student {

    //Encapsulation: kapsulleme
    //encapsulation data hidingtir(veri saklama)
    //data nasil saklanir?
    //Access modifierleri private yaparak datayi diger classlardan gorunmez hale getirerek saklarim
    //encapsulation yaptigimiz datayi istersek diger claslardan okuyabiliriz



    public String stdName="Ali Can";
    public int age=15;
    private String stdId="AC2021222212";
    private double notOrt=3.13;
    private boolean successful=false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return successful;
    }


}
