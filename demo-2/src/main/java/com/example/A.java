package com.example;

public class A {

	@SuppressWarnings("unused")
	private final void setValue(int x, int y) {
		System.out.println("parent private setValue|" + x + "|" + y);
	}

}
