package com.sandeepps.ch13threads;

public class ThreadDemo {

	synchronized void a() {
		System.out.println("a");
		actBusy();
	}

	static synchronized void b() {
		System.out.println("b");
		actBusy();
	}

	static void actBusy() {
		try {
			
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
	}

	public static void main(String[] args) {
		final ThreadDemo x = new ThreadDemo();
		final ThreadDemo y = new ThreadDemo();
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int option = 0;//(int) (Math.random() * 4);
				System.out.println(Thread.currentThread().getName());
				System.out.println(option);
				switch (option) {
				case 0:
					x.a();
					break;
				case 1:
					x.b();
					break;
				case 2:
					y.a();
					break;
				case 3:
					y.b();
					break;
				}
			}
		};

		Thread thread1 = new Thread(runnable);
		Thread thread2 = new Thread(runnable);
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
	}

}
