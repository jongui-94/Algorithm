package Baekjoon._220101;

import java.util.Scanner;

public class Main_10871_forif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n ,x, a;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextInt();
		
		//int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			a = sc.nextInt();
			//arr[i] = a;
			if(a<x)
				System.out.print(a+" ");
		}

	}

}
