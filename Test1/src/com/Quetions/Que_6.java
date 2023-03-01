package com.Quetions;

public class Que_6 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int a=5;a>=i;a--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
