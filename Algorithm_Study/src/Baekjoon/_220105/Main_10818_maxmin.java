package Baekjoon._220105;

import java.util.Scanner;

public class Main_10818_maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int max = -1000000, min = 1000000;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]<=min)
				min = arr[i];
			if(arr[i]>=max)
				max = arr[i];
		}
		
		
		System.out.println(min + " "+ max);
		

	}

}
