package O19;

public class Abstract {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        GameCalculator gameCalculator=new WomanGameCalculator();
    }
}
