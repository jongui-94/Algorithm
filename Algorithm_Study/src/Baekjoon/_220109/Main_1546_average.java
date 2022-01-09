package Baekjoon._220109;

import java.util.Scanner;

public class Main_1546_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n; 
		int max=0;
		double sum=0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int arr[]= new int[n];
		double arr2[]= new double[n];
		
		for(int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]>max)
				max = arr[i];
		}
		for(int j=0;j<n;j++)
		{
			arr2[j] = arr[j] / (double)max * 100;
			sum += arr2[j];
		}
		sum = sum/n;
		System.out.println(sum);

	}

}
