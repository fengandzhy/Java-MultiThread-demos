package org.zhouhy.concurrency.demo01;

/**
 * Java�����main������һ���߳�,�Ǳ�JVM����ʱ����,�̵߳����ֽ�main
 * ʵ��һ���߳�,���봴��Threadʵ����override run����,���ҵ���start����
 * ������jvmʱ,ʵ�����ж���߳�,��������һ���ػ��߳�
 * ��������̵߳�start����ʱ�����������߳�,һ���ǵ�������̵߳��߳�,����һ����ִ��run�������߳�
 * �̵߳���������Ϊnew Runnable Running blocked Terminated
 * */
public class ThreadCreate {
	
	public static void main(String args[]) {
		Runnable runnable = ()->System.out.println("abcd");
		Thread t1 = new Thread(runnable,"Thread1");
		t1.start();
	}
	
	
}
