package K13;

public class K03_ForLoops {
    public static void main(String[] args) {
        int toplam=0;

        for (int i = 1; i <4 ; i++) {
            toplam+=i;
            System.out.println(toplam);

            //-------------------

            int bas=20;
            int bitis=100;
            for (int j = bas; j <=bitis ; j+=3) {
                System.out.println(j+" ");
            }
            //----------------------------
            int input=50;
            for (int j = 50; j >=11 ; j--) {
                if (j%3==0){
                    System.out.println(j);
                }

            }

        }
    }
}
