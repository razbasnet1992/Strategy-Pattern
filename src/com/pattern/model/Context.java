package com.pattern.model;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	public int execute(int b,int c) {
		return strategy.doMath(b, c);
	}

}
