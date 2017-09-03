package com.profound.util;
import java.util.Scanner;
public class FindIsland{
	static int i,j;
	static int array[][]=new int[5][5];

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				array[i][j]=sc.nextInt();
			}
		}

		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				//an island is one whose value is 1(land) and it is surrounded by 0(water) from all four sides
				if(array[i][j]==1 && array[i-1][j]==0 && array[i+1][j]==0 && array[i][j-1]==0 && array[i][j+1]==0)
					System.out.println("Island found at locaion: i="+i+" and j="+j);
			}
		}
	}
}
