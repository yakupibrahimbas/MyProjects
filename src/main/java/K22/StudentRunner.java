package K22;

public class StudentRunner {
    public static void main(String[] args) {

        System.out.println(Student.stdName);
        Student ali=new Student();
        System.out.println(ali.age);
        Student.staticMethod();
        ali.nonStaticMethod();



    }
}
