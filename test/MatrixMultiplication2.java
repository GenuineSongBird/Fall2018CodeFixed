package test;
import java.util.Scanner;
public class MatrixMultiplication2 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter the number of rows in matrix1:");
		int mat1_rows = key.nextInt();
		
		System.out.println("Enter the number of columns in matrix1:");
		int mat1_cols = key.nextInt();
		
		System.out.println("Enter the number of rows in matrix2:");
		int mat2_rows = key.nextInt();
		
		if(mat1_cols != mat2_rows) {
			System.out.println("Dimension mismatch! Cannot multiply these matrices");
			System.exit(0);
			
		}
		System.out.println("Enter the number of columns in matrix2:");
		int mat2_cols = key.nextInt();
		
		int[][] matrix1 = new int[mat1_rows][mat1_cols];
		for(int i = 0; i < mat1_rows; i++) { //row
			for(int j = 0; j < mat1_cols; j++) {//column
				System.out.println("Enter the value of matrix 1 at position (" + i + "," + j + ")");
				matrix1[i][j] = key.nextInt();
			}
		}
		int[][] matrix2 = new int[mat2_rows][mat2_cols];
		for(int i = 0; i < mat2_rows; i++) { //row
			for(int j = 0; j < mat2_cols; j++) {//column
				System.out.println("Enter the value of matrix 2 at position (" + i + "," + j + ")");
				matrix2[i][j] = key.nextInt();
			}
		}
		
		int[][] product = new int[mat1_rows][mat2_cols];
		int sum = 0;
		//multiply the matrices
		for(int i = 0; i < mat1_rows; i++) {
			for(int j = 0; j < mat2_cols; j++) {
				for(int k = 0; k < mat1_cols; k++) {
				    sum	+= matrix1[i][k] * matrix2[k][j];
				}
				product[i][j]=sum;
				sum = 0;
			}
			
		}
		
		for(int i = 0; i < mat1_rows; i++) {
			for(int j = 0; j < mat2_cols; j++) {
				System.out.print(product[i][j] + " ");
			}
			System.out.println();
		}

	}

}
