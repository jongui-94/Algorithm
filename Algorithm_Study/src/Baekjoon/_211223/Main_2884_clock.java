package Baekjoon._211223;

import java.util.Scanner;

public class Main_2884_clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour, min;
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		min = sc.nextInt();
		
		if(min < 45)
		{
			min += 15;
			if(hour == 0)
			{
				hour = 23;
			}
			else
			{
				hour -= 1;
			}
		}
		else if(min >= 45)
		{
			min -= 45;
		}
		System.out.println(hour + " " + min);
		
		
	}

}
