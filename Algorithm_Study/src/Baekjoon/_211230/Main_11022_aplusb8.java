package Baekjoon._211230;

import java.util.Scanner;


public class Main_11022_aplusb8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, n, sum;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			sum = 0;
			sum = a + b;
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+sum);
		}

	}

}
