package K24;

public class PersonRunner {
    public static void main(String[] args) {
        Person person=new Person();
        person.firstName="Furkan";
        person.lastName="Baysan";
        person.age=25;

        person.setEmail("burak@hmail.com");
        System.out.println(person.getEmail());
        person.setEmail("ali@gmail.com");
        System.out.println(person.getEmail());
    }
}
