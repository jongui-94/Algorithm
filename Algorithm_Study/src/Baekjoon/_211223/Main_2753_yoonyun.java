package Baekjoon._211223;

import java.util.Scanner;

public class Main_2753_yoonyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if(year % 4 == 0)
		{
			if((year % 100 != 0) || (year % 400 == 0))
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
		}
		else
		{
			System.out.println(0);
		}

	}

}