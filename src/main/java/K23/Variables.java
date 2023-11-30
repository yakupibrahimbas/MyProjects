package K23;

public class Variables {
    public static void main(String[] args) {
       // int sayi=5;
       // int sayi1;
       // int Sayi;


        int sayi1=5;
        int sayi2=20;
        sayi1=sayi2;
        sayi1=30;
        System.out.println(sayi2);
        //reference data types

        int [] numbers={15,25,35,45};
        //int [] numbers2=new int[]{55,122,1111,4,65};

        int[] numbers2=new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i]=numbers[i];
        }

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        numbers[1]=48;
        System.out.println(numbers2[1]);

        //numbers2=numbers;
        //numbers[0]=5;
        //System.out.println(numbers2[1]);

        //wrapper class


       /* int sayi3=55;
        Integer sayi4=new Integer(55); */

        String name="Furkan BAYSAN";
      String channelName=new String("Yazilim Konseptleri");
        System.out.println(name+" "+channelName);

        String firstName="Furkan";
        name=firstName+" Baysan";
        String lasttName="Baysan";
        System.out.println(name);

        String fname="Omer";
        String Iname="Tasci";
        fname=Iname;
        System.out.println(fname);


    }
}
