package O14;

public class Karakter {
    public static void main(String[] args) {

        char harf='E';

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf");
                break;
            default:
                System.out.println("Ince sesli harf");
        }

    }
}
