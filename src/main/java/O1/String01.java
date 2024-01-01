package O1;

public class String01 {
    public static void main(String[] args) {
    //run time error kod calistirildiginda anlasilan kodlardir
        //javada iki tur hata vardir
        //Compile time error:kod yazzarken alinan kirmizi alt cizgiler
        //run time error:kod calistiktan sonra(run time errror olustugunda sonraki kodlar calistirilmaz)
        //Java kodla calistirmayi (execution)durdurur

        String s2="Ogreten ogrenir";
        System.out.println(s2.concat(" tamam mi?"));
        //String methodlari gecici degisiklil yapar. orjinal string degismez
        String s3="Java ogren zengin ol";
        System.out.println(s3.contains("a"));
        String s4="Cok calis is bul";



    }
}
