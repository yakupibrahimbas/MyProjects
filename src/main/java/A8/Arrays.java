package A8;

public class Arrays {
    public static void main(String[] args) {

   int x0,x1,x2,x3,x4;
   x0=0;
   x1=1;
   x2=2;
   x3=3;
   x4=4;

   int[]sayiDizisi=new int[10];
   sayiDizisi[0]=3;
   sayiDizisi[1]=5;
   sayiDizisi[2]=7;
   sayiDizisi[9]=6;

   int a=sayiDizisi[9];
        System.out.println(a);

        for (int i=0; i<sayiDizisi.length;i++){
            System.out.println(sayiDizisi[i]);
        }
    }
}
