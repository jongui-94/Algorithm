package Baekjoon._211222;

import java.util.Scanner;

public class Main_2588_mutiquiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		int first, second, third;
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		first = b % 10;
		third = b / 100;
		second = (b-(100*third)) / 10;
		
		System.out.println(a*first);
		System.out.println(a*second);
		System.out.println(a*third);
		System.out.println(a*b);
		

	}

}
