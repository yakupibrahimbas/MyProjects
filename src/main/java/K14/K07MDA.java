package K14;

public class K07MDA {
    public static void main(String[] args) {
        int[][] tablo=new int[][]{
                {1,75,10},{2,87,13},{3,95,15},{4,103,18},{5,110,19}
        };
int[][] tablo2=new int[5][3];
tablo2[0][0]=1;
tablo2[0][1]=75;
tablo2[0][2]=10;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[0].length; j++) {
                System.out.println(tablo[i][j]+"");
            }
            System.out.println();
        }
    }
}
