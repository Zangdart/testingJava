package testingJava;

import java.util.Random;
import java.util.Scanner;

public class matrixSum {

	public static void main(String[] args) {
		matrixSum mat = new matrixSum();
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		double[][] tab = new double[4][4];

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				tab[i][j] = r.nextInt(10);
				System.out.print(tab[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.println(mat.moyenneCases(tab, 0, 0));

	}
	
	  public double moyenneCases(double[][] mat, int ligne, int colonne){
	        double somme = 0;
	        
	        for (int i = -1; i <= 1; i++) {
	            for (int j = -1; j <= 1; j++) {
	                somme += mat[ligne + i][colonne + j];
	            }
	        }
	        
	        return somme / 9;
	    }	
	
	
	
	
	
	

	
	//double for et mettre count et un return
	/*
	public double getAverage(int row, int col, int[][] tab) {
		double sum = 0;
		int count = 1;

		if (row - 1 > 0) {
			sum += tab[row][col - 1] + tab[row][col + 1] + tab[row + 1][col] + tab[row - 1][col];
			count++;
			return sum = sum / count;
		}
		if (row - 1 < tab.length) {
			sum += tab[row][col - 1] + tab[row][col + 1] + tab[row + 1][col] + tab[row - 1][col];
			count++;
			return sum = sum / count;
		}
		if (col - 1 > 0) {
			sum += tab[row][col - 1] + tab[row][col + 1] + tab[row + 1][col] + tab[row - 1][col];
			count++;
			return sum = sum / count;
		}
		if (col + 1 < tab[0].length) {
			sum += tab[row][col - 1] + tab[row][col + 1] + tab[row + 1][col] + tab[row - 1][col];
			count++;
			return sum = sum / count;
		}
		return sum;
	}
*/
}
