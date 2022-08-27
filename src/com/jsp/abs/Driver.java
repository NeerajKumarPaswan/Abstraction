package com.jsp.abs;

public class Driver {

	public static void main(String[] args) {
		
		Son son=new Son();
		son.buyCar();
		son.buyHouse();
		System.out.println("======================================");
		
		GrandFather g=new Son();
		Son s=(Son)g;
		s.buyCar();
		s.buyHouse();
		s.m1();
	}
}
