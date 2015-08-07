package com;

public class ThreadDemo {

	public static void main(String[] arg0){
		Synchronized ss=new Synchronized();
		Thread t1=new Thread(ss);
		Thread t2=new Thread(ss);
		Thread t3=new Thread(ss);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
