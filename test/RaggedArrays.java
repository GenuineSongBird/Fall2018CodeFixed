package test;

public class RaggedArrays {

	public static void main(String[] args) {
		//int[] first = {1, 2, 3};
		int[][] second = {{1,2,3,4} , {7,8}};
		
		for(int i = 0; i < second.length; i++) {
			for(int j = 0; j < second[i].length; j++) {
				System.out.print(second[i][j] + " ");
				
			}
			System.out.println();
		
		}
	}

}
