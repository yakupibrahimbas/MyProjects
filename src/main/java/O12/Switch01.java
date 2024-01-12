package O12;

public class Switch01 {
    public static void main(String[] args) {
        char grade='A';
        switch (grade){
            case 'A':
                System.out.println("Mukemmel: Gectiniz");
                break;
            case 'B':
                System.out.println("Cok guzel: Gectiniz");
                break;
            case 'C':
                System.out.println("Fena Degil: Gectiniz");
                break;
            case 'D':
                System.out.println("Kotu bir not: Gectiniz");
                break;
            case 'F':
                System.out.println("Malesef: Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz bir not girdiniz");
        }

    }
}
