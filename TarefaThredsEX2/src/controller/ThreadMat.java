package controller;

public class ThreadMat extends Thread  {
		
	int[][]mat;
	int i;
	
	
	public ThreadMat(int[][]mat, int i) {
		this.mat = mat;
		this.i = i;
	}

	@Override
	public void run() {
		
		CalcLinha(mat, i);
	}
	

	
	public void CalcLinha ( int[][] mat, int i){
		int somamat = 0;
		
		switch (i) {
		case 0: {
			for ( int j= 0; j < 5; j ++) {

				somamat = somamat + mat[0][j];
			}
			break;
		}
		case 1: 
			for ( int j= 0; j < 5; j ++) {
				somamat = somamat + mat[1][j];
			}
			break;
			
		case 2: 
			for ( int j= 0; j < 5; j ++) {
				somamat = somamat + mat[2][j];
			}
			break;
		default:
			
		}
		int tid = (int) threadId();
		System.out.println("#"+tid+ " ==> A soma da linha " +i + " = " + somamat);
	}




}
