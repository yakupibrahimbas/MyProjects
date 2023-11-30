package K25.K25_2;

public class Student {
    public String stdName="Ali Can";
    public int age=15;
    private String stdId="AC20253653353";
    private double notOrt=3.13;
    private boolean succesful=false;

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }

    public String getStdId() {
        return stdId;

    }

}
