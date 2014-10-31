package com.somnus.designPatterns.command;

public interface Command
{
	//接口里定义的process()方法用于封装"处理行为"
	public void process(int[] target);
}
