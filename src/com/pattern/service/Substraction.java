package com.pattern.service;

import com.pattern.model.Strategy;

public class Substraction implements Strategy{
	public int doMath(int a,int b) {
		return a-b;
	}

}