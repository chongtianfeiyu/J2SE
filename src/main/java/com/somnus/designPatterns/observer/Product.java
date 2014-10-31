package com.somnus.designPatterns.observer;

public class Product extends Observable
{
	private String name;
	private double price;
	public Product(String name, double price)
	{
		super();
		this.name = name;
		this.price = price;
	}
	public Product()
	{
		super();
	}
	public String getName()
	{
		return name;
	}
	
	//当程序调用name的setter方法来修改Product的name属性时
	//程序自然触发该对象注册的所有观察者
	public void setName(String name)
	{
		this.name = name;
		notifyObservers(name);
	}
	public double getPrice()
	{
		return price;
	}
	
	//当程序调用price的setter方法来修改Product的price属性时
	//程序自然触发该对象注册的所有观察者
	public void setPrice(double price)
	{
		this.price = price;
		notifyObservers(price);
	}
	
}
