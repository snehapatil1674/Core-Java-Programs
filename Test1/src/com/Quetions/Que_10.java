package com.Quetions;
import java.util.Scanner;
public class Que_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ct1=0;
        int ct2=0;
        for(int i=2;i<num1;i++)
        {
        	if(num1%i==0)
        	{
        		ct1++;
        	}
        	System.out.println(ct1);
        }
        for(int i=2;i<num2;i++)
        {
        	if(num2%i==0)
        	{
        		ct2++;
        	}
        	System.out.println(ct2);
        }
        
        int d=num1-num2;
        if(ct1==0 && ct2==0 &&d==2 ||d==-2)
        	System.out.println("no is twin prime num");
        
	}

}
