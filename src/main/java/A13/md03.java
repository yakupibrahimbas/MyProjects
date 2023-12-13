package A13;

public class md03 {
    public static void main(String[] args) {

        //int turunde bir multidimensional array deki en kucuk ve en buyuk elemanin toplamşini blun

        int[][] ages={{15,4},{12,43,21}};
        int enKucuk=ages[0][0];
        int enBuyuk=ages[0][0];

        for (int[]w:ages){
            for (int k:w) {
                enKucuk=Math.min(enKucuk,k);
            }
        }
        System.out.println(enKucuk);
        System.out.println(enBuyuk);
        System.out.println(enKucuk+enBuyuk);

    }
}
