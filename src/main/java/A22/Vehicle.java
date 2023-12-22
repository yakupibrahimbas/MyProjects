package A22;

public class Vehicle {
//Child classtaki constructordan parent classdaki constructora gidebilmek icin super()kullanilir
//Ayni classtaki constructorlari secmek icin this() kullanilir. Ayni classta birde nfazla constructor varsa istenilen constructor this ifadesinin parantezi icine yazilan parametreler yardimi ile secilebilir.
//super() ve thiis() ifadeleri constructor icinde yazilan parametreler yardimi ile secilebilir
    public Vehicle(){
        super();

        System.out.println("Vehicle1");
    }
    public Vehicle (int price){
        System.out.println("Vehicle 2");
    }
}
