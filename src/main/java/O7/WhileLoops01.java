package O7;

public class WhileLoops01 {
    public static void main(String[] args) {

        //3 basamakli 4 ve 6 ya tam bolunebilen tamsayilari buyukten kucuge ekrana yaziniz

        int i=999;
        int counter=0;
        while (i>100){
            if (i%6==0 &&i%4==0){
                System.out.print(i+" ");
                counter++;
            }
            i--;
        }
        System.out.println();
        System.out.println("4 ve 6 ya bolunen 3 basamakli "+counter+" tane sayi vardir");
    }
}
