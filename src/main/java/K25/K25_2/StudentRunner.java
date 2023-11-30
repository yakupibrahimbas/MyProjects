package K25.K25_2;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1=new Student();
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());
        s1.setStdId("VH123543653");
        System.out.println(s1.getStdId());
        s1.setNotOrt(4.4);
        s1.setSuccesful(true);
        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());
    }
}
