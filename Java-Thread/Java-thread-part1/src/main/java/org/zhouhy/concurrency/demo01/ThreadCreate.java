package org.zhouhy.concurrency.demo01;

/**
 * Java程序的main函数是一个线程,是被JVM启动时调用,线程的名字叫main
 * 实现一个线程,必须创建Thread实例并override run方法,并且调用start方法
 * 在启动jvm时,实际上有多个线程,但至少有一个守护线程
 * 当你调用线程的start方法时至少有两个线程,一个是调用你的线程的线程,另外一个是执行run方法的线程
 * 线程的生命周期为new Runnable Running blocked Terminated
 * */
public class ThreadCreate {
	
	public static void main(String args[]) {
		Runnable runnable = ()->System.out.println("abcd");
		Thread t1 = new Thread(runnable,"Thread1");
		t1.start();
	}
	
	
}
