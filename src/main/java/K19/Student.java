package K19;

public class Student {
    public String stdName="Ali Can";
    protected String address="Istanbu";
    String email="alican@gmail.com";

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", tcKimlikNo='" + tcKimlikNo + '\'' +
                '}';
    }

    private String tcKimlikNo="12345678912";
}
