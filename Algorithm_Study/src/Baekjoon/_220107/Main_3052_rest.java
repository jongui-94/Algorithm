package Baekjoon._220107;

import java.util.Scanner;

public class Main_3052_rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, rest, divide = 42;
		
		int arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<10;i++)
		{
			a = sc.nextInt();
			rest = a % 42;
			arr[i] = rest;
		}
		for(int i: arr)
		{
			
		}

	}

}
