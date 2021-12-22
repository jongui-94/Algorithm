package Baekjoon._211222;

import java.util.Scanner;

public class Main_10430_rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c)) % c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c)) % c);

	}

}
