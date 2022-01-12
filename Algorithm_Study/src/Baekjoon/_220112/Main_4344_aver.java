package Baekjoon._220112;

import java.util.Scanner;

public class Main_4344_aver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tc, num;
		Scanner sc = new Scanner(System.in);
		tc = sc.nextInt();
		
		for(int i = 0; i<tc; i++)
		{
			num = sc.nextInt();
			int arr[] = new int[num];
			int sum = 0;
			double avr = 0;
			double result = 0;
			int cnt=0;
			
			for(int j = 0; j<num;j++)
			{
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			avr = sum / num;
			for(int k: arr)
			{
				if(k>avr)
					cnt+=1;
			}
			result = (double)cnt/(double)num*100;
			System.out.printf("%.3f%%\n", result);
			
		}//Math.round(result*1000)/1000.0

	}

}
