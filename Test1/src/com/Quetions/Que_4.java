package com.Quetions;

import java.util.Scanner;

public class Que_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		 int prod=1;
		 int sum=0;
		while(num>0)
		{  
			int digit=num%10;
			prod=prod*digit;
			sum=sum+digit;
			num/=10;
		}
		System.out.println(prod);
		System.out.println(sum);
		if(sum==prod)
			System.out.println("spy");
		else
			System.out.println("Not spy");
		
	}

}
