package com.Quetions;

import java.util.Scanner;

public class Que_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any num");
		int num=sc.nextInt();
		int copynum=num;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num=copynum;
		int cube=num*num*num;
		System.out.println(cube);
		
		int prod=1;
		for(int i=1;i<=count;i++)
		{
			prod=prod*10;
		}
		int lastnum=cube%prod;
		System.out.println(lastnum);
		if(num==lastnum)
		{
			System.out.println("Trimorphic");
		}
		else
			System.out.println("Not Trimorphic");
		
			
			
		
	}

}
