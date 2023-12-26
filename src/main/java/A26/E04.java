package A26;

public class E04 {
    public static void main(String[] args) {
        printAge(63);
        printAge(313);
        printAge(-5);


    }
    public static void printAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else {
            System.out.println(age);
        }

        System.out.println(age);
        //throw keyword bir methodun bodysi icinde istediginiz yerde istediginiz kosullarda exception atmanizi saglar

    }
}
