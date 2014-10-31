package com.somnus.designPatterns.factoryMethod.product;

import com.somnus.designPatterns.factoryMethod.Printer;

/*
 * 高速打印机
 */
public class BetterPrinter extends Printer
{
	private  final int MAX_CACHE_LINE = 10;
	private String[] printData = new String[MAX_CACHE_LINE * 2];
	
	private int dataNum = 0;

	@Override
	public void getData(String msg)
	{
		if(dataNum >= MAX_CACHE_LINE * 2)
		{
			System.out.println("输出队列已满,添加失败");
		}
		else
		{
			printData[dataNum++] = msg;
		}
	}

	@Override
	public void out()
	{
		while(dataNum>0)
		{
			System.out.println("高速打印机打印: "+printData[0]);
			
			System.arraycopy(printData,1,printData,0,--dataNum);
		}
	}
}
