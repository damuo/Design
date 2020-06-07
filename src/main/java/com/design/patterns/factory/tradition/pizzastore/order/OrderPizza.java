package com.design.patterns.factory.tradition.pizzastore.order;

import com.design.patterns.factory.tradition.pizzastore.pizza.CheesePizza;
import com.design.patterns.factory.tradition.pizzastore.pizza.GreekPizza;
import com.design.patterns.factory.tradition.pizzastore.pizza.PepperPizza;
import com.design.patterns.factory.tradition.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 订购披萨类
 */
public class OrderPizza {
	// 构造器
	public OrderPizza() {
		Pizza pizza = null;
		String orderType; // 订购披萨的类型
		do {
			orderType = getType();
			if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" 希腊披萨 ");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" 奶酪披萨 ");
			} else if (orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("胡椒披萨");
			} else {
				break;
			}
			//输出pizza 制作过程
			//准备材料
			pizza.prepare();
			//烘烤
			pizza.bake();
			//切割
			pizza.cut();
			//打包
			pizza.box();
		} while (true);
	}
	// 写一个方法，可以获取客户希望订购的披萨种类
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
