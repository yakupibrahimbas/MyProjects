package A26;

public class ExceptionRunner {
    public static void main(String[] args) {

        getStudentGrade(-2);
    }
    public static void getStudentGrade(int grade){
        if (grade<0||grade>100){
            try {
                throw new InvalidStudentGradeException("Students grades cannot be less than zero or greater than 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());            }
        }else {
            System.out.println(grade);
        }
    }
}
