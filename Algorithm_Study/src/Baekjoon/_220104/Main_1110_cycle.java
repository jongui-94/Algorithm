package Baekjoon._220104;

import java.util.Scanner;

public class Main_1110_cycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, new_num, cycle=0;
		int sip=0, ill=0, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		new_num = n;
		
		while(true)
		{
			sip = new_num /10;
			ill = new_num % 10;
			sum = sip + ill;
			new_num = (ill*10) + (sum%10);
			cycle++;
			if(new_num == n)
				break;
		}
		System.out.println(cycle);

	}

}
