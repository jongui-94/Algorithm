package Baekjoon._220107;

import java.util.Scanner;

public class Main_3052_rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, rest;
		boolean check = true;
		int count =0;
		
		int arr[] = new int[10];
	
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++)
		{
			arr[i] = (sc.nextInt()%42);
		}
		for(int j=0;j<10;j++)
		{
			check = true;
			for(int k=j+1;k<10;k++)
			{
				if(arr[j]==arr[k] )
					check = false;
			}
			if(check == true)
				count +=1;
		}
		System.out.println(count);
		
		

	}

}
