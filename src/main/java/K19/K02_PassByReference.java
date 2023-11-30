package K19;

public class K02_PassByReference {
    public int number2;
    public void change(K02_PassByReference reference){
        reference=new K02_PassByReference();
        reference.number2=reference.number2+3;
    }

}
