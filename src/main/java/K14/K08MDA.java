package K14;

public class K08MDA {
    public static void main(String[] args) {
        int [][]multiArray= {{7,4,2},{12,3,5}};
       // System.out.println(multiArray[1][2]);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(multiArray[i][j]+" ");

            }
            System.out.println();
        }
    }
}
