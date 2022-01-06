package Baekjoon._220106;

import java.util.Scanner;

public class Main_2577_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, result, rest= 0;
		
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		result = a * b * c;
		
		int arr[] = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0; i<9;i++)
		{
			rest = result % 10;
			arr[rest] += 1;
			result = result /10;
			if(result == 0)
				break;

			
		}
		for (int j:arr)
		{
			System.out.println(j);
		}
		

	}

}
