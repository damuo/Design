package com.design.patterns.factory.tradition.pizzastore.pizza;

/**
 * 胡椒披萨类
 */
public class PepperPizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println("胡椒披萨 准备原材料 ");
	}

}
