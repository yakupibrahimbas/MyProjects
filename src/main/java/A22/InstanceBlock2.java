package A22;

public class InstanceBlock2 {
    //Eger tum constructorlarin icinde calismasi gereken ayni kodlar varsa tekrardan kurtulmak icin bu kodlari instance block icine yazariz

    public int year;
    {
        System.out.println("Herkese Selam");

    }
    public InstanceBlock2(){



    }

    public InstanceBlock2(int year) {
        System.out.println("Herkese selam");
        this.year = year;
    }
}
