package com.Quetions;

public class Que_15 {

	public static void main(String[] args) 
	{int sum=0;
	for(int i=1;i<=6;i++)
	{
		int fact=1;
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
		}
		sum=sum+fact;
		System.out.println(sum);
		
	}
		
	}

}
