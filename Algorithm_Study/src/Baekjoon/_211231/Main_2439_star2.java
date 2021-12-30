package Baekjoon._211231;

import java.util.Scanner;

public class Main_2439_star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>0;j--)
			{
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
