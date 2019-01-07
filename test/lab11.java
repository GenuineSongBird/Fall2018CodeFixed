//tyson medlin, johnathin evans
package test;
import java.util.Scanner;
public class lab11 {
	public static void main(String[] args) {
		System.out.println("Welcome to the matrix subtracting program!");
		int mat1_rows = 0;
		int mat1_cols = 0;
		int mat2_rows = 0;
		int mat2_cols = 0;
		Scanner key = new Scanner(System.in);
		System.out.println("Please enter the legnth of the first matrix");
		mat1_rows = key.nextInt();
		System.out.println("Please enter the height of the first matrix");
		mat1_cols = key.nextInt();
		System.out.println("Please enter the legnth of the second matrix");
		mat2_rows = key.nextInt();
		System.out.println("Please enter the height of the second matrix");
		mat2_cols = key.nextInt();
		
		if(mat1_rows != mat2_rows || mat1_cols !=  mat2_cols) { //checks if matrices are of different sizes
			System.out.println("Cannot substract these matrices. Dimension mismatch!");
			System.exit(0);
		}
		
		int[][] matrix1 = new int[mat1_rows][mat1_cols]; //initializes matrix1, matrix 2, and matrixProduct
		int[][] matrix2 = new int[mat1_rows][mat1_cols];
		int[][] matrixProduct = new int[mat1_rows][mat1_cols];
		
		for(int i = 0; i < mat1_rows; i++) { //has user fill first matrix
			for(int j = 0; j < mat1_cols; j++) {
				System.out.println("Please enter a value for matrix 1 at position (" + i + "," + j + ")");
				matrix1[i][j] = key.nextInt();
			}
		}
		
		for(int i = 0; i < mat2_rows; i++) { //has user fill second matrix
			for(int j = 0; j < mat2_cols; j++) {
				System.out.println("Please enter a value for matrix 2 at position (" + i + "," + j + ")");
				matrix2[i][j] = key.nextInt();
			}
		}
		
		for(int i = 0; i < mat1_rows; i++) { //subtracts the matrices
			for(int j = 0; j < mat2_cols; j++) {
				matrixProduct[i][j] = matrix1[i][j] - matrix2[i][j];
			}
		}
		
		for(int i = 0; i < mat1_rows; i++) { //outputs first matrix
			for(int j = 0; j < mat2_cols; j++) {
				System.out.print(matrix1[i][j] + " ");
				
			}
			System.out.println("");
		}
		System.out.println("-");
		for(int i = 0; i < mat1_rows; i++) { //outputs second matrix
			for(int j = 0; j < mat2_cols; j++) {
				System.out.print(matrix2[i][j] + " ");
				
			}
			System.out.println("");
		}
		System.out.println("=");
		for(int i = 0; i < mat1_rows; i++) { //outputs the product
			for(int j = 0; j < mat2_cols; j++) {
				System.out.print(matrixProduct[i][j] + " ");
				
			}
			System.out.println("");
		}
		System.out.println("DONE!");
	}
}
