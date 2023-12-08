package A2;

public class Exceptions {
    public static void main(String[] args) {

    }

    public class IstisnaYakalama{
        public static void konumHesapla(int konumNo){
            if (konumNo==0){
                throw new ArithmeticException();

            }else {
                System.out.println("Konum hesaplaniyor."+konumNo);
            }
        }
        public static void main(String []args){
            konumHesapla(0);
            System.out.println("Burasi calisiyor");
        }
    }
}
