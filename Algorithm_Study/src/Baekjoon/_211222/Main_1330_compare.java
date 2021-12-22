package Baekjoon._211222;

import java.util.Scanner;

public class Main_1330_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b)
		{
			System.out.println(">");
		}
		else if(a == b)
		{
			System.out.println("==");
		}
		else
		{
			System.out.println("<");
		}
				
	}

}
