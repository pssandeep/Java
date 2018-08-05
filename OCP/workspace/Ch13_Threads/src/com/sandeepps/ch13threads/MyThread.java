package com.sandeepps.ch13threads;

public class MyThread implements Runnable{

	public void run(){		
		System.out.println("MyThread is Running...");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
	}
}
