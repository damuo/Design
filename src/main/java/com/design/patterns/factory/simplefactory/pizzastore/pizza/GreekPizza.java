package com.design.patterns.factory.simplefactory.pizzastore.pizza;

/**
 * 希腊披萨类
 */
public class GreekPizza extends Pizza {
	@Override
	public void prepare() {
		System.out.println("希腊披萨 准备原材料");
	}

}
