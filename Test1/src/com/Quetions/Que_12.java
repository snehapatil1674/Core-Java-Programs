package com.Quetions;

public class Que_12 {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++)
		{
			if(i%2!=0)
			{
				System.out.println(-i+" "+(i*i));
			}
			else if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
