package com.design.patterns.factory.simplefactory.pizzastore.pizza;

/**
 * 奶酪披萨类
 */
public class CheesePizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println("制作奶酪 准备原材料");
	}

}

