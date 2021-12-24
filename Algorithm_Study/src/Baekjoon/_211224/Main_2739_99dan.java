package Baekjoon._211224;

import java.util.Scanner;

public class Main_2739_99dan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=9; i++)
		{
			System.out.println(n + " * " + i + " = " + (n*i));
		}

	}

}
