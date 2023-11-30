package K23;

public class ArrayAsAReference {

    public void changeToArray(int [] array ){
        array=new int[]{7,8,9};
        array[0]=array[0]+7;
        //array[0]=95;
    }

}
