import  java.util.Arrays;
public class MatrisTranspozu {
    public static void main(String[] args) {

        int[][] matris = {
                {2, 3, 4},
                {5, 6, 7}
        };

        System.out.println("Matris");

        for(int i = 0; i < matris.length; i++) {
            for(int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }

        int[][] traspoz = new int[3][2];

        System.out.println("Matrisin Transpozu");

        for (int i = 0; i <= matris.length; i++) {
            for (int j = 0; j < matris.length; j++) {
                    traspoz[i][j] = matris[j][i];
                    System.out.print(traspoz[i][j] + " ");

                }
            System.out.println();
            }
    }
}
