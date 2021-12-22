package Baekjoon._211222;

import java.util.Scanner;

public class Main_1008_divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b;
		double c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.println(Math.round(a/b*1000000000)/1000000000.0);

	}

}
