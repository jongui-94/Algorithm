package Baekjoon._211224;

import java.util.Scanner;

public class Main_10950_aplusb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, a, b;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			arr[i] = a+b;
		}
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
