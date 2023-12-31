package A31;

public class String01 {
    public static void main(String[] args) {
        String s1="Study hard stay humble";
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(5));
        System.out.println(s1.charAt(s1.length()-1));
if (s1.length()%2!=0){
    System.out.println(s1.charAt((s1.length()-1)/2));
}else {
    System.out.println("Orta karakter yok");
}

     //   System.out.println(s1.charAt(38)); --->exception firlatir. Cunku 38 yok
    }
}
