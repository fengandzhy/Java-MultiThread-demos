package org.zhouhy.concurrency.demo01;

public class ThreadCreate {
	
	public static void main(String args[]) {
		new Thread(()->System.out.println("abc"));
	}
}
