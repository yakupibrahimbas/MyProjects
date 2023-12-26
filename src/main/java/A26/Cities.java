package A26;

public enum Cities {
    ADANA(01,"Adana","010000"),
    TRABZON(61,"Trabzon","610000"),
    ADIYAMAN(02,"Adiyaman","0200232"),
    AFYON(03,"Afyon","030000");

    private final int plataCode;
    private final String cityName;
    private final String postalCode;

    Cities(int plataCode, String cityName, String postalCode) {
        this.plataCode = plataCode;
        this.cityName = cityName;
        this.postalCode = postalCode;
    }

    /*
    enumdaki datalar sabittir
    enumdan new keywordu ile yeni bir object olusturamazsiniz
    enumdaki constructor yeni bir object olusturmak icin degil, enumun icindekiherbir datanin ixcindeki .. baslatmak icin kullanilir


     */

    public int getPlataCode() {
        return plataCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
