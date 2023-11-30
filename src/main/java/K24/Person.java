package K24;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
       // this.email=email;

        if (email.contains("@")){
            this.email=email;
        }else {
            this.email="Invalid email";
        }

        }
    }


