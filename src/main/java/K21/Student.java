package K21;

public class Student {
    public String stdName="Ali Can";
    protected String address="Istanbul";
    String email="alican@gmail.com";
    private String tcKimlik="12345678923";

    @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
