package com.example;

public class AB extends A implements IAB {

	public void setValueAt(int row, int col) {
		// VScode diagnose takes the wrong signature
		// It takes the one from A instead of IAB interface.
		if (setValue(row, col)) {
			System.out.println("aaa");
		}
		// workaround, call super from interface:
		if (IAB.super.setValue(row, col)) {
			System.out.println("aaa");
		}
	}
}
