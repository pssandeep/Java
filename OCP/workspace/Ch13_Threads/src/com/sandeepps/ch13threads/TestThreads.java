package com.sandeepps.ch13threads;

public class TestThreads {
	public static void main(String[] args) throws InterruptedException {
		MyThread r = new MyThread();
		Thread t = new Thread(r);
		t.setName("NewThread");
		t.start();
		
		System.out.println("MAIN" + Thread.currentThread().getId());
		System.out.println("MAIN" + Thread.currentThread().getName());
		System.out.println(t.isAlive());
		System.out.println("Test Threads");
		System.out.println(t.isAlive());
		Thread.sleep(1000);
		t.start();
	}
}
