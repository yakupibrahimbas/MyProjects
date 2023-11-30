package K21;

public class OutsideErisim extends Test{
    public static void main(String[] args) {

        Test testObjesi=new Test();
        System.out.println("Eristifgim degiskenler:"+testObjesi.herkese);

        OutsideErisim outsideErisimObjesi=new OutsideErisim();
        System.out.println("Eristigim degiskenler:"+outsideErisimObjesi.korumali+outsideErisimObjesi.herkese);
    }
}
