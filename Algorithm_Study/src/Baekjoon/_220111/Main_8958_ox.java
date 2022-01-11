package Baekjoon._220111;

import java.util.Scanner;

public class Main_8958_ox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i<n; i++)
		{
			int cnt = 0;
			int sum = 0;
			String s = sc.next();
			for(int j = 0; j<s.length();j++)
			{
				if(s.charAt(j) == 'O')
				{
					cnt += 1;
					sum += cnt;
				}
				else
				{
					cnt = 0;
				}
					
			}
			System.out.println(sum);
		}
		
		
	

	}

}
