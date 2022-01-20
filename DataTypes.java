package com.ycp;

public class DataTypes {

	public static void main(String[] args) {
		int x;
		int y;
		x=10;
		y=20;
		System.out.println("x="+x);//here + is use to concatinnate
		System.out.println("y="+y);
		x=2147483647;
		System.out.println("x="+x);
		long a=123456789012l;
		System.out.println("a="+a);
		byte b1=0b101;
		System.out.println("b1="+b1);
		float c=2.5f;
		System.out.println("c="+c);
		char ch1='A';
		char ch2='\u006B';
		System.out.println("c1="+ch1);
		System.out.println("c2="+ch2);
		boolean flag=true;
		System.out.println("flag="+flag);
		x=21;
		y=8;
		float p=x/(float)y;//typecasting
		System.out.println("x/y= "+(x/y));
		System.out.println("p="+p);
		float q=12.5f;
		System.out.println((q==12.5));//never do this
		System.out.println((x<y));
		System.out.println("hello");

	}

}
