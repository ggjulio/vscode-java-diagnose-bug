package com.example;

public interface IAB {

	default boolean setValue(int row, int col) {
		return true;
	}
}
