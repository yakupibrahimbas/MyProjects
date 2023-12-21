package A21;

public class Student {
    //Access modifier erişim belirleyici
    //public- protected -default-private
    public String stdName="Ali Can";
    protected String adress="Istanbul";
    String email="alican@gmail.com";
    private String tcKimlik="123456797";

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
