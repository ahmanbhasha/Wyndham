package com.wyndhamhotels.home;

public class SampleClass implements MathOperations
{
int a=10;
int b=30;


	public static void main(String[] args) 
	{
		SampleClass sc=new SampleClass();
		sc.add();
		sc.sub();
		sc.mul();
		sc.div();

	}


	@Override
	public void add() {
		System.out.println(b+a);
		
	}


	@Override
	public void sub() {
		System.out.println(b-a);
		
	}


	@Override
	public void mul() {
		System.out.println(b*a);
		
	}


	@Override
	public void div() {
		System.out.println(b/a);
		
	}

}
