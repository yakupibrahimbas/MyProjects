package K22;

public class Calisan {

    private String isim;
    private static int toplamCalisan=0;
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Calisan(String isim) {
        this.isim = isim;
        toplamCalisan++;
    }

public static int calisanSayisiniGoster(){
        return toplamCalisan;
}

}
