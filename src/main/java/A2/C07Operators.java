package A2;

public class C07Operators {
    public static void main(String[] args) {

        //"="  it is Assignment operator==> Takes the value from the right put it into the containeron the left
        //"==" Equality operator==> Checks if the value on the left is the same with the value on the right
        // 2+3==5==>true
        //so == in java returns boolean
        //'A'==65 is returns true beacause ASCI table
        //IF you use char with any mathematical operation Java uses the ASCII value of the char

        System.out.println('A'==65);
        System.out.println('A'+'a'); //Because I used char with addition operation so Java used the ASCI value of the char
        //Find ASCII value of "!" by typing code
        System.out.println('!'*1); //33
        System.out.println('!'+0);//33
        //"!" ==> Not operator==> !true=false !false=true !!true=true
        //"!="==> Not equals Operator
        //2+3!=7==>true this statement is false
        //"<" ,">","<=",">=" return boolean
        //when you use true or false return in java
        /*
        "==" with Strings
        Every String has two main things i)value ii)Adress

       */

       String s1="Tom";
       String s2="Hanks";
       String s3="Tom";
       String s4=new String("Tom");
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        System.out.println(s1==s4);
        // checks both i)VAlue and ii) Address if both are same it returns true
        //But as a developer , we do not need to check address that is why when we compare two Strings we do not use"=="









    }
}
