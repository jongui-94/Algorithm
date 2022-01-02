package Baekjoon._220102;

import java.util.Scanner;

public class Main_10952_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, sum;
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b == 0)
				break;
			sum = a + b;
			System.out.println(sum);
		}

	}

}
