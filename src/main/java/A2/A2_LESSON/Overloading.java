package A2.A2_LESSON;

public class Overloading {
    public static void main(String[] args) {

        int arr[]={1,2,3,4};
        double arr1[]={3,2,4.3,5.5,6.7};
        toplama(arr);


    }
    private static void toplama(int[]arr){
        int toplam=0;
        for (int a:arr){
            toplam+=a;
        }
        System.out.println(toplam);
    }
}
