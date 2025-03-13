//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] matrix = new int[2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }


        //Matris transpozunu hesaaplayınız
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpoz = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpoz[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}