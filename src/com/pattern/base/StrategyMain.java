package com.pattern.base;

import com.pattern.model.Context;
import com.pattern.service.Substraction;

public class StrategyMain {

	public static void main(String[] args) {
		Context context = new Context(new Substraction());
		System.out.println(context.execute(10, 20));

	}

}
