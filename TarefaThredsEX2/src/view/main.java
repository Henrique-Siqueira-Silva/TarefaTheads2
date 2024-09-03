package view;


import controller.ThreadMat;

public class main {

	public static void main (String[] args ) {
		
		int[][] mat = new int[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				mat[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		for (int i = 0; i < 3; i++) {
			
			ThreadMat t = new ThreadMat(mat, i);
			t.start();
		}

	}

}
