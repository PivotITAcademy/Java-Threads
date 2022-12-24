package com.example.Threads;

public class ExampleThread {

	public static void main(String[] args) {

		
		
		MyRunnable runnable = new MyRunnable();
	
		Thread thread1=new Thread(runnable);
		
		MyThread thread2=new MyThread();
		
		thread1.start();
		thread2.start();
		
		MyHashTable ht= new MyHashTable();
		
		ht.printHashTableValues();
		
		
		

	}

}
