package test;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
	
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the # of rows of matrix 1:");
		int mat1_rows = key.nextInt();
		System.out.println("Enter the # of columns of matrix 1:");
		int mat1_cols = key.nextInt();
		System.out.println("Enter the # of rows of matrix 2:");
		int mat2_rows = key.nextInt();
		
		if(mat1_cols != mat2_rows) {
			System.out.println("Dimension mismatch");
			System.exit(0);
		}
		System.out.println("Enter the # of columns of matrix 2:");
		int mat2_cols = key.nextInt();
		
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		
		for(int i = 0; i < mat1_rows; i++) { //row
			for(int j = 0; j < mat1_cols; j++ ) { //column
				System.out.println("Enter the value for matrix 1 at position (" + i + ", " + j  + ")");
				matrix1[i][j] = key.nextInt();
				
			}
		}
		for(int i = 0; i < mat2_rows; i++) {
			for(int j = 0; j < mat2_cols; j++ ) {
				System.out.println("Enter the value for matrix 2 at position (" + i + ", " + j  + ")");
				matrix2[i][j] = key.nextInt();
				
			}
		}
		
		
		
	}

}
