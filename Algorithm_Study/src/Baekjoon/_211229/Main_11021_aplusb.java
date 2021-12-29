package Baekjoon._211229;

import java.util.Scanner;

public class Main_11021_aplusb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, n, sum;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i = 1;i<=n;i++)
		{
			sum = 0;
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a +b;
			System.out.println("Case #"+i+": "+sum);
		}

	}

}
