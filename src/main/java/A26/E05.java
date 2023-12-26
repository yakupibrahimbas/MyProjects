package A26;

import java.io.FileInputStream; //input outout
import java.io.FileNotFoundException;
import java.io.IOException;

public class E05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src\\main\\java\\A26\\file.txt");
//throw ile throws arasindaki fark nedir?
        //throw method bodysi icinde throws ise method parantezinden hemen sonra kullanilir
        //throw method bodysi icinde istenilen yerde istenildigi kadar kullanilabilir
        //throwdan sonra new keyword ve constructor kullanarak object olusturulur
        //throwsdan sonra sadece excepton class ismi yazilir

        try {
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.println((char) k);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
        }


    }
}
