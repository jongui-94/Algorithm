package Baekjoon._211222;

import java.util.Scanner;

public class Main_9498_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade;
		Scanner sc = new Scanner(System.in);
		grade = sc.nextInt();
		
		if (grade >= 90)
		{
			System.out.println("A");
		}
		else if(grade >= 80)
		{
			System.out.println("B");
		}
		else if(grade >= 70)
		{
			System.out.println("C");
		}
		else if(grade >= 60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}

	}

}
