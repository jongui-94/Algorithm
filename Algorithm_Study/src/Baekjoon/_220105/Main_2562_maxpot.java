package Baekjoon._220105;

import java.util.Scanner;

public class Main_2562_maxpot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int max=0, index = 0;
		int arr[]= new int[9];
		
		for(int i=0;i<9;i++)
		{
			arr[i] = sc.nextInt();
			if(arr[i]>max)
			{
				max = arr[i];
				index = i;
			}
				
				
		}
		System.out.println(max);
		System.out.println(index+1);

	}

}
