package com.somnus.map;

public class HashMap {
	
	public static void main(String[] args) {

		final java.util.HashMap<Integer,Integer> map = new java.util.HashMap<Integer,Integer>();
		// 同时启动10个线程，去进行i++计算，看看实际结果
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                	for (int j = 0; j < 100; j++) {
                        map.put(j, j);
                    }
                	System.out.println(Thread.currentThread().getName()+" put over");
                }
            }).start();
        }
        // 同时启动10个线程，去进行i++计算，看看实际结果
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                	for (int j = 0; j < 100; j++) {
                        System.out.println(Thread.currentThread().getName()+ ":" + map.get(j));;
                    }
                	System.out.println(Thread.currentThread().getName()+" get over");
                }
            }).start();
        }
	
	}
	
}
